package demoqaSelenide.tests;

import demoqaSelenidePages.ClassAttributePage;
import demoqaSelenidePages.HomePage;
import org.testng.annotations.Test;

public class ClassAttributeTest extends TestBase {
    @Test
    public void clickBlueBtnAndPopUp(){

        new HomePage().selectClassAttribute();
        new ClassAttributePage().clickBlueButton();

    }

}
