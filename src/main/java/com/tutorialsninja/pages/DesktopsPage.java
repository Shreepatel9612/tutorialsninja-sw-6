package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsTab;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Show AllDesktops']")
    WebElement showAll;

    @CacheLookup
    @FindBy(css = "button[class='btn btn-link dropdown-toggle']")
    WebElement currencyDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortDropDown;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='HTC Touch HD']")
    WebElement htcTouchHd;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-left']//a")
    WebElement cartProductName;

    @CacheLookup
    @FindBy(css = ".alert-success")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-left'][2]")
    WebElement cartProductModel;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-right'][2]")
    WebElement cartProductPrice;


    public String desktopText() {
        getTextFromElement(desktopText);
        log.info("Getting desktop text");
        Reporter.log("Getting desktop text");
        return getTextFromElement(desktopText);
    }

    public void clickOnShowAll() {
        clickOnElement(showAll);
        log.info("Clicking on showing all");
        Reporter.log("Clicking on showing all");
    }

    public void mouseHoverAndClickOnTab(String tab) {
        mouseHoverToElementAndClick(desktopsTab);
        log.info("Hovering and clicking on desktops tab");
        Reporter.log("Hovering and clicking on desktops tab");
    }

    public void clickOnMenu() {
        clickOnElement(showAll);
        log.info("Clicking on showing all");
        Reporter.log("Clicking on showing all");
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
        log.info("Clicking on Build your own computer" + buildYourOwnComputer.toString());
        Reporter.log("Clicking on Build your own computer" + buildYourOwnComputer.toString());
    }

    public void selectSortByPostionZtoA(String type) {
        selectByVisibleTextFromDropDown(sortDropDown, "Name (Z - A)");
        log.info("Clicking on z - a" + sortDropDown.toString());
        Reporter.log("Clicking on z - a" + sortDropDown.toString());
    }

    public void selectProductSorting(String type) {
        selectByVisibleTextFromDropDown(sortDropDown, type);
        log.info("sorting from dropdown  menu Z to A" + sortDropDown.toString());
        Reporter.log("sorting from dropdown  menu Z to A" + sortDropDown.toString());
    }

    public void selectSortByPostionAtoZ(String type) {
        selectByVisibleTextFromDropDown(sortDropDown, "Name (A - Z)");
        log.info("Click on Build your own Computer");
        Reporter.log("Clicking on Build your own computer" + buildYourOwnComputer.toString());
    }

    public void clickOnHTCtouchHD(String hdd) {
        clickOnElement(htcTouchHd);
        log.info("Clicking on HTC touch " + htcTouchHd.toString());
        Reporter.log("Clicking on HTC touch " + htcTouchHd.toString());
    }

    public String getProductName() {
        log.info("Getting product name");
        Reporter.log("Getting product name");
        return getTextFromElement(By.cssSelector("div[class='col-sm-4'] h1"));
    }

    public void clickOnLinkInSuccessMessage(String linkName) {
        clickOnElement(By.linkText(linkName));
        log.info("Clicking on link in success message");
        Reporter.log("Clicking on link in success message");
    }

    public void clickOnButton(String buttonName) {
        clickOnElement(addToCartButton);
        log.info("Clicking on add to cart button");
        Reporter.log("Clicking on add to cart button");
    }

    public String getSuccessMessage() {
        log.info("Getting success message");
        Reporter.log("Getting success message");
        return getTextFromElement(successMessage);
    }

    public String getCartProductName() {
        log.info("Getting cart product name");
        Reporter.log("Getting cart product name");
        return getTextFromElement(cartProductName);
    }

    public String getCartProductModel() {
        log.info("Getting cart product model");
        Reporter.log("Getting cart product model");
        return getTextFromElement(cartProductModel);
    }

    public String getCartProductPrice() {
        log.info("Getting cart product price");
        Reporter.log("Getting cart product price");
        return getTextFromElement(cartProductPrice);
    }

    public void enterQuantity(String quantity) {
        clearTextFromField(quantityField);
        sendTextToElement(quantityField, quantity);
        log.info("Entering quantity");
        Reporter.log("Entering quantity");
    }

    public void selectCurrency(String currency) {
        clickOnElement(currencyDropdown);
        WebElement currencyOption = driver.findElement(By.linkText(currency));
        clickOnElement(currencyOption);
        log.info("Selecting currency from dropdown");
        Reporter.log("Selecting currency from dropdown");
    }

    public boolean isProductsSortedDescending() {
        List<String> originalList = new ArrayList<>();
        for (WebElement product : productList) {
            originalList.add(product.getText());
        }
        List<String> sortedList = new ArrayList<>(originalList);
        sortedList.sort(Collections.reverseOrder());
        return originalList.equals(sortedList);
    }
}

