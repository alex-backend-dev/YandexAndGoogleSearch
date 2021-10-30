package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeOutVariable.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public boolean searchElementIsVisible(By element) {
        var searchFindButton = driver.findElement(element);
        waitElementIsVisible(searchFindButton);

        return true;
    }
    public static boolean isLoadComplete(WebDriver driver)
    {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("loaded")
                || ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    public boolean atPageByTitle(String title) {
        if (driver.getTitle().equals(title)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean atPageByURL(String URL) {
        if (driver.getCurrentUrl().equals(URL)) {
            return true;
        }
        else {
            return false;
        }
    }
}