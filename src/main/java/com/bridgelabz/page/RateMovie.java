package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RateMovie extends BaseClass {
    BookTickets bookTickets;

    @FindBy(xpath = "//span[contains(text(),'Rate now')]")
    private WebElement rateBtn;

    @FindBy(id = "range")
    private WebElement rateBar;

    @FindBy(xpath = "//span[contains(text(),'Submit Rating')]")
    private WebElement submitBtn;

    // initialization
    public RateMovie() {
        PageFactory.initElements(driver, this);
    }

    public BookTickets rate() {
        rateBtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rateBar.click();
        rateBar.sendKeys("9");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
           /* submitBtn.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            */
        return new BookTickets();
    }

}

