package pages.google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleSearchPage extends BasePage {
    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    private final By listOfSearchQueries = By.xpath("//div[@class = 'yuRUbf']/a");
    private final By findButton = By.xpath("//button[@class = 'Tg7LZd']");

    public boolean clickOnAThirdSearchQuery() {
        searchElementIsVisible(findButton);

        var listOfElements = driver.findElements(listOfSearchQueries);
        listOfElements.get(2).click();

        return isLoadComplete(driver);
    }
}
