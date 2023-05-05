package rozetka;

import org.testng.annotations.Test;
import rozetka.businessObject.SearchProduct;

public class ChooseProductsTest extends BaseTest {

    @Test
    public void searchPhoneProductsTest() {
        new SearchProduct().searchSomeProduct("phone");
    }

    @Test
    public void searchWaterProductsTest() {
        new SearchProduct().searchSomeProduct("water");
    }

    @Test
    public void searchMirrorProductsTest() {
        new SearchProduct().searchSomeProduct("mirror");
    }
}
