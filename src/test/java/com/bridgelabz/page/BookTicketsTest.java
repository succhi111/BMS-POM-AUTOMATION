package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookTicketsTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    SearchMovie searchMovie;
    BookTickets bookTickets;


    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("7004471705");
        searchMovie = homePage.gotoSearch();
        bookTickets = new BookTickets();
    }

    @DataProvider
    public Object[][] getBookTestData() {
        return Utility.getTestData("book");
    }

    @Test(dataProvider = "getBookTestData")
    public void bookTest(String Movie2) {
        bookTickets = bookTickets.book(Movie2);


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}