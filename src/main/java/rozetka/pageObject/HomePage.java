package rozetka.pageObject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class HomePage {

    private final By searchTextField = By.xpath("//rz-main-header//input");
    private final By searchButton = By.xpath("//rz-main-header/header//form/button");

    public HomePage setSearchCriteria(String searchCriteria) {
        log.info("Enter search criteria [{}] into search field", searchCriteria);
        $(searchTextField).sendKeys(searchCriteria);
        return this;
    }

    public SearchPage clickSearchButton() {
        log.info("Click search button");
        $(searchButton).click();
        return new SearchPage();
    }
}
