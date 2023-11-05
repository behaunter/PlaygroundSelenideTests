package demoqaSelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadPage {

    private SelenideElement buttonAfterDelay = $x("//button[contains(text(),'Button Appearing After Delay')]");

    public LoadPage confirmButtonAfterDelay(){
        buttonAfterDelay.click();
        buttonAfterDelay.shouldBe(Condition.exist).shouldBe(Condition.visible);
        return this;
    }
}
