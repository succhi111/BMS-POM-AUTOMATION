package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyLoginPage() {
    }

    @DataProvider
    public Object[][] getLoginTestData() {

        return Utility.getTestData("login");
    }

    @Test(dataProvider = "getLoginTestData")
    public void loginTest(String MobNumber) {
        homePage = loginPage.login(MobNumber);
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}