package demoqaSelenide.tests;

import demoqaSelenidePages.HomePage;
import demoqaSelenidePages.VisibilityPage;
import org.testng.annotations.Test;

public class VisibilityTest extends TestBase{

@Test
    public void clickOnHideBtnAndCheckOtherButtons(){
    new HomePage().selectVisibility();
    new VisibilityPage().clickOnHideBtn();
}

}
