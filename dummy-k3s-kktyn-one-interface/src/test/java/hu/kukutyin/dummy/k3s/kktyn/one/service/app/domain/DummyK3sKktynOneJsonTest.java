package hu.kukutyin.dummy.k3s.kktyn.one.service.app.domain;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyK3sKktynOneJsonTest {
    public static final String GROUP_ID_VALUE = "https://k3s-kktyn.com/v1/connect?access_token=EAAKyEpSTiY4wZDZD";

    private ConstantsResponse constantsResponse;

    @BeforeEach
    public void setUp() {
        constantsResponse = new ConstantsResponse().groupIdValue(GROUP_ID_VALUE);
    }

    @Test
    void constantsResponseTest() throws IOException {
        String constantsResponseStr = "{\"groupIdValue\": \"https://k3s-kktyn.com/v1/connect?access_token=EAAKyEpSTiY4wZDZD\"}";
        ConstantsResponse actual = new ObjectMapper().readValue(constantsResponseStr, ConstantsResponse.class);
        assertEquals(GROUP_ID_VALUE, constantsResponse.getGroupIdValue());
        assertEquals(GROUP_ID_VALUE, actual.getGroupIdValue());
    }
}
