package rozetka;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rozetka.config.DriverManager;

@Test(groups = "all")
public class BaseTest {

    @BeforeMethod
    public void manageDriver() {
        new DriverManager().manageDriver();
    }
}
