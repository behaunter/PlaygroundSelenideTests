package demoqaSelenide.tests;

import demoqaSelenidePages.HomePage;
import demoqaSelenidePages.LoadPage;
import org.testng.annotations.Test;

public class LoadDelayTest extends TestBase{

    @Test
    public void testOfDelay(){
        new HomePage().selectLoadDelay();
        new LoadPage().confirmButtonAfterDelay();
    }
}
