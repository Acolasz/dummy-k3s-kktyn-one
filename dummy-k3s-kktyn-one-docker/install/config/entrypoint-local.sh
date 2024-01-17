#!/bin/sh

export JAVA_OPTS="-Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -XX:+UseContainerSupport -Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses -Djava.security.egd=file:/dev/./urandom"

if [ "${SERVICE_PORT_DEBUG}" ]; then
  export JAVA_OPTS="${JAVA_OPTS} -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:${SERVICE_PORT_DEBUG}"
fi

set -e

exec java -Dserver.port=${SERVICE_PORT_SERVICE} ${JAVA_OPTS} -jar ${SPRING_APP_LOCATION}/service.jar --spring.config.location=file:${SPRING_CONFIG_LOCATION}/
