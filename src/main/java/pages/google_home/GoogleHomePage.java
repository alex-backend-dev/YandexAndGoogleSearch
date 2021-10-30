package pages.google_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.google_search.GoogleSearchPage;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    private final By searchField = By.xpath("//input[@class = 'gLFyf gsfi']");
    private final By findButton = By.xpath("//div[@class = 'FPdoLc lJ9FBc']/center/input[@value = 'Поиск в Google']");

    public GoogleSearchPage inputData(String data) {

        driver.findElement(searchField).sendKeys(data);
        driver.findElement(findButton).click();

        isLoadComplete(driver);
        return new GoogleSearchPage(driver);
    }
}
