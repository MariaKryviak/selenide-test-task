package rozetka.pageObject;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class SearchPage extends HomePage {

    private final By searchText = By.xpath("//rz-search-heading/div/h1");

    public SearchPage getSearchResult(String expectedText) {
        log.info("Verify search result have value: [{}]", expectedText);
        $(searchText).shouldHave(partialText(expectedText));
        return this;
    }
}
