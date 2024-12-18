package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement verifyYourAccountHasBeenCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickContiue;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement logoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContiue1;

    @FindBy(linkText = "My Account")
    WebElement myAccountLink;

    @FindBy(xpath = "//h1")
    WebElement pageHeader;

    @FindBy(id = "input-firstname")
    WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    WebElement lastNameInput;

    @FindBy(id = "input-email")
    WebElement emailInput;

    @FindBy(id = "input-telephone")
    WebElement telephoneInput;

    @FindBy(id = "input-password")
    WebElement passwordInput;

    @FindBy(id = "input-confirm")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@name='newsletter' and @value='1']")
    WebElement subscribeYesRadio;

    @FindBy(xpath = "//input[@name='newsletter' and @value='0']")
    WebElement subscribeNoRadio;

    @FindBy(name = "agree")
    WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//input[@type='submit' or @value='Continue']")
    WebElement continueButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement successMessage;


    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
        log.info("Clicking on my account link");
        Reporter.log("Clicking on my account link");
    }

    public void selectMyAccountOptions(String option) {
        WebElement myAccountOption = driver.findElement(By.linkText(option));
        clickOnElement(myAccountOption);
        log.info("Selecting my account options");
        Reporter.log("Selecting my account options");
    }

    public String getPageHeaderText() {
        log.info("Getting page header text");
        Reporter.log("Getting page header text");
        return getTextFromElement(pageHeader);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameInput, firstName);
        log.info("Entering first name");
        Reporter.log("Entering first name");
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameInput, lastName);
        log.info("Entering last name");
        Reporter.log("Entering last name");
    }

    public void enterEmail(String email) {
        sendTextToElement(emailInput, email);
        log.info("Entering email id");
        Reporter.log("Entering email id");
    }

    public void enterTelephone(String telephone) {
        sendTextToElement(telephoneInput, telephone);
        log.info("Entering phone numeber");
        Reporter.log("Entering phone number");
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordInput, password);
        log.info("Entering password");
        Reporter.log("Entering password");
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordInput, confirmPassword);
        log.info("Entering confirmation password");
        Reporter.log("Entering confirmation password");
    }

    public void selectSubscribeOption(String option) {
        if (option.equalsIgnoreCase("Yes")) {
            clickOnElement(subscribeYesRadio);
        } else {
            clickOnElement(subscribeNoRadio);
        }
    }

    public void clickOnPrivacyPolicyCheckbox() {
        clickOnElement(privacyPolicyCheckbox);
        log.info("Clicking on privacy policy");
        Reporter.log("Clicking on privacy policy");
    }

    public void clickOnButton(String buttonName) {
        clickOnElement(continueButton);
        log.info("Clicking on continue button");
        Reporter.log("Clicking on continue button");
    }

    public String getConfirmationMessage() {
        log.info("Getting confirmation message");
        Reporter.log("Getting confirmation message");
        return getTextFromElement(successMessage);
    }

    public String setVerifyYourAccountHasBeenCreatedText() {
        String message = getTextFromElement(verifyYourAccountHasBeenCreatedText);
        log.info("verify your account has been created text");
        Reporter.log("verify your account has been created text");
        return message;
    }

    public void clickContinue() {
        clickOnElement(clickContiue);
        log.info("click Continue");
        Reporter.log("click Continue");
    }

    public String setVerifyLogOutText() {
        String message = getTextFromElement(logoutText);
        log.info("verify LogOut text");
        Reporter.log("verify LogOut text");
        return message;
    }

    public void clickContinue1() {
        clickOnElement(clickContiue1);
        log.info("click Continue");
        Reporter.log("click Continue");
    }
}
