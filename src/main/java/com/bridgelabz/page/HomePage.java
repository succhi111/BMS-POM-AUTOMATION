package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[5]")
    private WebElement sports;
    @FindBy(id = "4")
    private WebElement searchBar;

    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    public String verifyHomePageTitle() {

        return driver.getTitle();
    }

    public String verifyHomePageUrl() {
        return driver.getCurrentUrl();
    }

    public void elementPresent() {
        sports.isDisplayed();
    }

    public SearchMovie gotoSearch() {
        searchBar.click();
        return new SearchMovie();
    }

}
