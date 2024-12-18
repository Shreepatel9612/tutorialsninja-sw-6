package com.tutorialsninja.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    //  By emailField = By.id("Email");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    //    By passwordField = By.name("Password");
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    //    By loginButton = By.xpath("//input[@value = 'Log in']");
    @CacheLookup
    @FindBy(xpath = "//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")
    WebElement loginButton;
    //    By errorMessage = By.xpath("//div[@class = 'validation-summary-errors']");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement verifyReturnText;


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailId " + email);
        Reporter.log("Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password " + password);
        Reporter.log("Enter Password " + password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on loginButton");
        Reporter.log("Click on loginButton");
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("Get errorMessage");
        Reporter.log("Get errorMessage");
        return message;
    }

    public String verifyreturnText() {
        String message = getTextFromElement(verifyReturnText);
        log.info("verify Return Text");
        Reporter.log("verify Return Text");
        return message;
    }
}
