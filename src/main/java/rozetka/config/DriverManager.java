package rozetka.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.open;

@Slf4j
public class DriverManager {

    public void manageDriver() {
        String baseUrl = EnvProperties.getInstance().getBaseUrl();
        log.info("Set base URL [{}]", baseUrl);
        Configuration.browser = new Browser().getBrowserName();
        open(baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
