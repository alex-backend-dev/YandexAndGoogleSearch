package tests.yandex_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.InputData.SEARCH_IPHONE;
import static constants.Constant.Titles.YANDEX_HOME_PAGE_TITLE;
import static constants.Constant.Urls.YANDEX_HOME_PAGE_URL;

public class YandexTest extends BaseTest {

    @Test
    public void yandexTests() {
        basePage.open(YANDEX_HOME_PAGE_URL);
        Assert.assertTrue(yandexHomePage.atPageByURL(YANDEX_HOME_PAGE_URL), "Wrong URL, we are not on a YandexHomePage");
        Assert.assertTrue(yandexHomePage.atPageByTitle(YANDEX_HOME_PAGE_TITLE), "Wrong Title, we are not on a YandexHomePage");
        yandexHomePage
                .inputData(SEARCH_IPHONE);
        Assert.assertTrue(yandexSearchPage.clickOnAThirdSearchQuery(), "No click, page is not loaded");
    }
}
