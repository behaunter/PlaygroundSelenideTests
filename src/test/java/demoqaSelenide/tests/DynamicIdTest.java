package demoqaSelenide.tests;

import com.codeborne.selenide.WebDriverRunner;
import demoqaSelenidePages.DynamicIdPage;
import demoqaSelenidePages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicIdTest extends TestBase {

    @Test
    public void clickWithDynamicId(){
        new HomePage().selectDynamicId();
        String first_id = new DynamicIdPage().clickOnDynamicIdButtonAndGetId();
        WebDriver driver = WebDriverRunner.getWebDriver();
        driver.navigate().refresh();
        String second_id = new DynamicIdPage().clickOnDynamicIdButtonAndGetId();
        Assert.assertNotEquals(first_id,second_id);

    }
}
