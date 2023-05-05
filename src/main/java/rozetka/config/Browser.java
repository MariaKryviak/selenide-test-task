package rozetka.config;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.MutableCapabilities;
import rozetka.exception.BrowserDriverNotFoundException;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;

@Slf4j
public class Browser {

    @SneakyThrows
    public String getBrowserName() {
        String browserName = ApplicationProperties.getInstance().getBrowserName();
        log.info("Selected browser: '{}'", browserName);
        switch (browserName.toLowerCase()) {
            case CHROME:
            case EDGE:
                return browserName.toLowerCase();
            default:
                throw new BrowserDriverNotFoundException(browserName);
        }
    }

    private MutableCapabilities getCapabilities() {
        MutableCapabilities capabilities = new MutableCapabilities();
        // TODO: Set some useful capabilities.
        return capabilities;
    }
}