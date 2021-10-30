package tests.google_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.InputData.SEARCH_IPHONE;
import static constants.Constant.Titles.GOOGLE_HOME_PAGE_TITLE;
import static constants.Constant.Titles.GOOGLE_SEARCH_PAGE_TITLE;
import static constants.Constant.Urls.GOOGLE_HOME_PAGE_URL;

public class GoogleTest extends BaseTest {

    @Test
    public void googleTests() {
        basePage.open(GOOGLE_HOME_PAGE_URL);
        Assert.assertTrue(googleHomePage.atPageByURL(GOOGLE_HOME_PAGE_URL), "Wrong URL, we are not on a GoogleHomePage");
        Assert.assertTrue(googleHomePage.atPageByTitle(GOOGLE_HOME_PAGE_TITLE), "Wrong Title, we are not on a GoogleHomePage");
        googleHomePage
                .inputData(SEARCH_IPHONE);
        Assert.assertTrue(googleSearchPage.atPageByTitle(GOOGLE_SEARCH_PAGE_TITLE), "Wrong Title, we are not on a GoogleSearchPage");
        Assert.assertTrue(googleSearchPage.clickOnAThirdSearchQuery(), "No click, page is not loaded");
    }
}
