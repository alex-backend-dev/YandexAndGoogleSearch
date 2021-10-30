package pages.yandex_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

public class YandexSearchPage extends BasePage {

    public YandexSearchPage(WebDriver driver) {
        super(driver);
    }

    private final By listOfSearchQueries = By.xpath("//li[@class = 'serp-item desktop-card']/div/h2/a");
    private final By findButton = By.xpath("//div[@class = 'search2__button']");

    public boolean clickOnAThirdSearchQuery() {
        searchElementIsVisible(findButton);

       var listOfElements = driver.findElements(listOfSearchQueries);
       listOfElements.get(2).click();

       return isLoadComplete(driver);
    }
}
