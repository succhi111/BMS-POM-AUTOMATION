package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTickets extends BaseClass {
    SearchMovie searchMovie;

    @FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    private WebElement searchMovie2;

    @FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[2]/span[1]")
    private WebElement JohnWick;

    @FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]/div[1]/span[1]")
    private WebElement bookBtn;

    @FindBy(xpath = "//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/section[2]/div[1]/span[1]")
    private WebElement Hindi2D;

    public BookTickets() {
        PageFactory.initElements(driver, this);
    }

    public BookTickets book(String movie2) {
        searchMovie2.sendKeys(movie2);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JohnWick.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bookBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Hindi2D.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new BookTickets();
    }


}

