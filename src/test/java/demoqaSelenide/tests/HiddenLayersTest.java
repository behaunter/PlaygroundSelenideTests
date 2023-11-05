package demoqaSelenide.tests;

import demoqaSelenidePages.HiddenLayersPage;
import demoqaSelenidePages.HomePage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.Test;

public class HiddenLayersTest extends TestBase{

//    @Test
//    public void clickOnGreenButtonTwice(){
//        new HomePage().selectHiddenLayers();
//        new HiddenLayersPage().doubleClickOnGreenButton();
//    }

    @Test
    public void clickGreenAndBlueButton(){
        new HomePage().selectHiddenLayers();
        new HiddenLayersPage()
                .clickOnGreenButton().clickOnBlueButton();
    }
}
