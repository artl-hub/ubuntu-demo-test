package demo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @BeforeAll
    static void setup() {
        String remoteUrl = System.getProperty("remoteUrl");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (remoteUrl != null && !remoteUrl.isEmpty()) {
            Configuration.remote = remoteUrl;
            capabilities.setCapability("enableVNC", true);
            // capabilities.setCapability("enableVideo", true);
            Configuration.browserVersion = "125.0";
        }

        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x1024";
        Configuration.timeout = 10000;

        Configuration.browserCapabilities = capabilities;
    }


    @Test
    void openGoogleAndWait() throws InterruptedException {
        open("https://google.com");
        Thread.sleep(5000);
    }
}
