package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RateMovieTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    SearchMovie searchMovie;
    RateMovie rateMovie;
    BookTickets bookTickets;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("7004471705");
        searchMovie = homePage.gotoSearch();
        rateMovie = searchMovie.search("Pathaan");
        rateMovie = new RateMovie();
    }

    @Test()
    public void rateTest() {
        bookTickets = rateMovie.rate();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}

