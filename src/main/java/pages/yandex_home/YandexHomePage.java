package pages.yandex_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.yandex_search.YandexSearchPage;

public class YandexHomePage extends BasePage {

    public YandexHomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchField= By.xpath("//input[@aria-autocomplete='list']");
    private final By findButton = By.xpath("//button[@type = 'submit']");

    public YandexSearchPage inputData(String data) {

        driver.findElement(searchField).sendKeys(data);
        driver.findElement(findButton).click();

        isLoadComplete(driver);
        return new YandexSearchPage(driver);
    }
}
