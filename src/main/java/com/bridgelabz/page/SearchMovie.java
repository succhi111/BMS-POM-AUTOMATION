package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMovie extends BaseClass {
    RateMovie rateMovie;

    @FindBy(xpath = "//div[contains(text(),'cinemas')]")
    private WebElement movieBtn;
    @FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/div[2]")
    private WebElement searchMovie;

    @FindBy(xpath = "//strong[contains(text(),'Pathaan')]")
    private WebElement output;

    // initialization
    public SearchMovie() {
        PageFactory.initElements(driver, this);
    }

    public void CheckButtonEnable() {
        movieBtn.isEnabled();
    }

    public RateMovie search(String movie) {

        searchMovie.sendKeys(movie);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        output.click();

        return new RateMovie();
    }

}