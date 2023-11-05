package demoqaSelenidePages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.files.DownloadActions.click;

public class HiddenLayersPage {

    private SelenideElement greenBtn = $("#greenButton");
    private SelenideElement blueBtn = $("#blueButton");

    public HiddenLayersPage clickOnGreenButton() {
        greenBtn.click();
        sleep(200);
        return this;
    }

    public HiddenLayersPage doubleClickOnGreenButton() {
        greenBtn.click();
        sleep(200);
        greenBtn.click();
        return this;
    }

    public HiddenLayersPage clickOnBlueButton() {
        blueBtn.click();
        sleep(200);
        return this;
    }
}

