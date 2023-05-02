package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchMovieTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    SearchMovie searchMovie;
    RateMovie rateMovie;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("7004471705");
        searchMovie = homePage.gotoSearch();
        searchMovie = new SearchMovie();
        rateMovie = new RateMovie();

    }

    @Test
    public void checkButtonEnable() {
    }

    @DataProvider
    public Object[][] getSearchTestData() {
        return Utility.getTestData("search");
    }

    @Test(dataProvider = "getSearchTestData")
    public void searchTest(String Movie) {
        rateMovie = searchMovie.search(Movie);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}

