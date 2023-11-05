package props;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TestListener implements TestWatcher {
    WebDriver driver = WebDriverRunner.getWebDriver();
    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        Allure.getLifecycle().addAttachment(
                "screenshot", "image/png", "png"
                , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
        );
        driver.close();
        driver.quit();
    }
}
