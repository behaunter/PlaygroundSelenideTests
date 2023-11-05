package demoqaSelenidePages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class ClassAttributePage {

    private SelenideElement blueButton = $("button.btn-primary");

    public ClassAttributePage clickBlueButton() {
       blueButton.shouldBe(exist).click();
       sleep(500);
        confirm();

        return this;
    }
}
