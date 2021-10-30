package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.google_home.GoogleHomePage;
import pages.google_search.GoogleSearchPage;
import pages.yandex_home.YandexHomePage;
import pages.yandex_search.YandexSearchPage;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected YandexHomePage yandexHomePage = new YandexHomePage(driver);
    protected YandexSearchPage yandexSearchPage = new YandexSearchPage(driver);
    protected GoogleHomePage googleHomePage = new GoogleHomePage(driver);
    protected GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

    @AfterSuite (alwaysRun = true)
    public void closeDriver() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
