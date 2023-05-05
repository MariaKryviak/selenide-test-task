package rozetka.businessObject;

import rozetka.pageObject.HomePage;

public class SearchProduct {

    public void searchSomeProduct(String searchWord) {
        new HomePage()
                .setSearchCriteria(searchWord)
                .clickSearchButton()
                .getSearchResult(searchWord);
    }
}
