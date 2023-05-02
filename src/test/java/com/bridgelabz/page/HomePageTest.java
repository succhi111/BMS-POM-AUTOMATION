package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    SearchMovie searchMovie;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("7004471705");
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Movie Tickets, Plays, Sports, Events & Cinemas near Mumbai - BookMyShow");
    }

    @Test
    public void verifyHomePageUrl() {
        String homePageURL = homePage.verifyHomePageUrl();
        Assert.assertEquals(homePageURL, "https://in.bookmyshow.com/explore/home/mumbai");
    }

    @Test
    public void elementPresent() {
    }

    @Test
    public void gotoSearch() {
        searchMovie = homePage.gotoSearch();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
