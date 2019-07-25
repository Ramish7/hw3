package server;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private class APIInfo {
        public long timestamp;
        public String version;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public APIInfo home() {
        APIInfo apiInfo = new APIInfo();
        apiInfo.timestamp = System.currentTimeMillis();
        apiInfo.version = "0.1.0";

        return apiInfo;
    }
}
