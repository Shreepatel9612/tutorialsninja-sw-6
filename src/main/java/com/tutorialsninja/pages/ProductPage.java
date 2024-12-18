package com.tutorialsninja.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement changeqty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickaddToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-cart']/div[1]")
    WebElement verifySuccess;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement clickOnShoppingCart;


    public void setChangeqty(String qty) {
        sendTextToElement(changeqty, qty);
        Reporter.log("enter qty" + changeqty + "in qty field " + changeqty.toString() + "<br>");
        log.info("enter qty" + changeqty + "in qty field " + changeqty.toString() + "<br>");

    }

    public void clickOnAddToCart() {
        clickOnElement(clickaddToCart);
        Reporter.log("click on Add to Cart" + clickaddToCart + " on product page " + clickaddToCart.toString() + "<br>");
        log.info("click on Add to Cart" + clickaddToCart + " on product page " + clickaddToCart.toString() + "<br>");
    }

    public void veridySuccessText() {
        String message = getTextFromElement(verifySuccess);
        log.info("shopping cart display into success");
        Reporter.log("shopping cart display into success");
    }

    public void setClickOnShoppingCart() {
        clickOnElement(clickOnShoppingCart);
        log.info("shopping cart display into success");
        Reporter.log("shopping cart display into success");
    }

    public String shoppingcarttext() {
        String message = getTextFromElement(clickOnShoppingCart);
        log.info("shopping cart display into success");
        Reporter.log("shopping cart display into success");
        return message;
    }
}
