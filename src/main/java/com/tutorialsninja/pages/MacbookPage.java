package com.tutorialsninja.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MacbookPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement qtyBox;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickUpdate;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement clickCheckoout;

    public void enterQTY() {
        sendTextToElement(qtyBox, "2");
        log.info("Change qty to 2");
        Reporter.log("Change qty to 2");
    }

    public void clickupdate() {
        clickOnElement(clickUpdate);
        log.info("click update");
        Reporter.log("click update");
    }

    public String verifyUpdate() {
        String message = getTextFromElement(clickUpdate);
        log.info("verify update");
        Reporter.log("verify update");
        return message;
    }

    public void clickCechkout() {
        clickOnElement(clickCheckoout);
        log.info("click checkout");
        Reporter.log("click checkout");
    }

    public String verifyTotal() {
        String message = getTextFromElement(verifyTotal);
        log.info("verify total");
        Reporter.log("verify total");
        return message;
    }
}
