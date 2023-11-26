package demoqaSelenide.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeMethod
    public void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );

        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        open("http://uitestingplayground.com");

        }

        @AfterMethod
        public void tearDown () {
            Selenide.closeWebDriver();
            System.out.println("закрыл сайт");
        }
    }

