package demoqaSelenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class VisibilityPage {

    private SelenideElement hideButton = $("#hideButton");
    private SelenideElement removedBtn = $("#removedButton");
    private SelenideElement zeroWidthButton = $("#zeroWidthButton");
    private SelenideElement overlappedButton = $("#overlappedButton");
    private SelenideElement transparentButton = $("#transparentButton");
    private SelenideElement invisibleButton = $("#invisibleButton");
    private SelenideElement notdisplayedButton = $("#notdisplayedButton");
    private SelenideElement offscreenButton = $("#offscreenButton");

    public VisibilityPage clickOnHideBtn(){
        removedBtn.shouldBe(visible);
        zeroWidthButton.shouldBe(visible);
        overlappedButton.shouldBe(visible);
        transparentButton.shouldBe(visible);
        invisibleButton.shouldBe(visible);
        notdisplayedButton.shouldBe(visible);
        offscreenButton.shouldBe(visible);
        hideButton.click();
        removedBtn.shouldNotBe(visible);
        zeroWidthButton.shouldNotBe(visible);
        transparentButton.shouldNotBe(visible);
        invisibleButton.shouldNotBe(visible);
        notdisplayedButton.shouldNotBe(visible);
        offscreenButton.shouldNotBe(visible);
        return this;
    }

}
