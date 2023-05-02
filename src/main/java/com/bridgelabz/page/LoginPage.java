package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//div[contains(text(),'Sign in')]")
    private WebElement loginBtn;
    @FindBy(xpath = "//div[contains(text(),'Get Started')]")
    private WebElement signIn;


    @FindBy(id = "mobileNo")
    private WebElement MobNumber;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement nextBtn;

    // initialization
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginPage() {
        signIn.isDisplayed();

    }

    public HomePage login(String mnum) {
        loginBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MobNumber.sendKeys(mnum);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nextBtn.click();
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new HomePage();

    }


}