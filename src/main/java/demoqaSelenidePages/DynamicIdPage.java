package demoqaSelenidePages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicIdPage {

    private SelenideElement dynamicIdBtn = $x("//button[text()='Button with Dynamic ID']");

    public String clickOnDynamicIdButtonAndGetId() {
        dynamicIdBtn.shouldBe(exist).click();
        String btnId = dynamicIdBtn.getAttribute("id");
        System.out.println(btnId);
        return btnId;
    }
}
