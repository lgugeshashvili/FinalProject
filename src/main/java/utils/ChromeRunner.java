package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public static void setUp(){
        open("https://www.myhome.ge/ka/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterMethod(description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown(){
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }

}
