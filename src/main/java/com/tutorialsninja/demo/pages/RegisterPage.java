package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "input-firstName")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "input-lastName")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement enterConfirmPasssword;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement enterTelephone;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    WebElement clickYesOnRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement policyBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement clickContinue;


    public String verifyRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("verify register text");
        Reporter.log("verify register text");
        return message;
    }

    public void enterFirstName(String name) {
        sendTextToElement(enterFirstName, name);
        log.info("enter First Name" + name);
        Reporter.log("enter First Name" + name);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(enterLastName, lastname);
        log.info("enter last Name" + lastname);
        Reporter.log("enter last Name" + lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(enterEmail, email);
        log.info("enter email" + email);
        Reporter.log("enter email" + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("enter password" + password);
        Reporter.log("enter password" + password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        sendTextToElement(enterConfirmPasssword, confirmpassword);
        log.info("enter password" + confirmpassword);
        Reporter.log("enter password" + confirmpassword);
    }

    public void entertelehpone(String telephone) {
        sendTextToElement(enterTelephone, telephone);
        log.info("enter telephone" + telephone);
        Reporter.log("enter telephone" + telephone);
    }

    public void radioYes() {
        clickOnElement(clickYesOnRadio);
        log.info("click yes on radio");
        Reporter.log("click yes on radio");
    }

    public void tickPolicyBox() {
        clickOnElement(policyBox);
        log.info("click policy box");
        Reporter.log("click policy box");
    }

    public void clickContinue() {
        clickOnElement(clickContinue);
        log.info("click continue");
        Reporter.log("click continue");
    }
}

