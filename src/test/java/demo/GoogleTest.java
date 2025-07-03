package demo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @BeforeAll
    static void setup() {
//        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x1024";
        Configuration.timeout = 10000;
//        Configuration.browserCapabilities.setCapability("enableVideo", true);
    }

    @Test
    void openGoogleAndWait() throws InterruptedException {
        open("https://google.com");
        Thread.sleep(5000);
    }
}
