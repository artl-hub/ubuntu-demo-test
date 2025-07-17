package demo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @BeforeAll
    static void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        String remoteUrl = System.getProperty("remoteUrl");
        System.out.println("DEBUG remoteUrl = " + remoteUrl);

        if (remoteUrl != null && !remoteUrl.isEmpty()) {
            Configuration.remote = remoteUrl;
            Configuration.browser = "chrome";
            Configuration.browserVersion = "124.0";

            capabilities.setCapability("enableVNC", true);
            // capabilities.setCapability("enableVideo", true);
        } else {
//            throw new RuntimeException("remoteUrl system property is not set. Use -DremoteUrl=http://localhost:4444/wd/hub");
            System.out.println("REMOTE_URL WAS NULL");
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
