package demoqaSelenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement dynamicIdLink = $(By.linkText("Dynamic ID"));
    private SelenideElement classAttributeBtn = $(By.linkText("Class Attribute"));
    private SelenideElement hiddenLayersBtn = $(By.linkText("Hidden Layers"));
    private SelenideElement loadDelayBtn = $(By.linkText("Load Delay"));
    private SelenideElement visibilityBtn = $(By.linkText("Visibility"));

    public DynamicIdPage selectDynamicId() {
        dynamicIdLink.shouldBe(exist).click();
        return page(DynamicIdPage.class);
    }

    public ClassAttributePage selectClassAttribute() {
        classAttributeBtn.shouldBe(exist).click();
        return page(ClassAttributePage.class);
    }

    public HiddenLayersPage selectHiddenLayers() {
        hiddenLayersBtn.shouldBe(exist).click();
        return page(HiddenLayersPage.class);
    }

    public LoadPage selectLoadDelay() {
        loadDelayBtn.shouldBe(exist).click();
        return page(LoadPage.class);
    }

    public VisibilityPage selectVisibility() {
        visibilityBtn.shouldBe(exist).click();
        return page(VisibilityPage.class);
    }

}
