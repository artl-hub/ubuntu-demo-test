package demo;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @BeforeAll
    static void setup() {
        // min setup
        Configuration.remote = System.getProperty("remoteUrl");

        Configuration.browser = "chrome";
        Configuration.browserVersion = "124.0";

        Configuration.browserSize = "1280x1024";
        Configuration.timeout = 10000;
    }

    @Test
    void openGoogleAndWait() throws InterruptedException {
        open("https://google.com");
        Thread.sleep(5000);
    }
}
