#!/bin/bash

PROJECT_NAME=acolasz
DOCKER_APP_NAME=dummy-kktyn-one-service-service
VERSION_TAG=1.0.0
IMAGE_NAME=${PROJECT_NAME}/${DOCKER_APP_NAME}:${VERSION_TAG}

docker-compose down
docker rmi -f $(docker images -f "dangling=true" -q)
docker rmi ${IMAGE_NAME}
docker-compose up --build -d

docker-compose logs --follow kktyn-one-service
