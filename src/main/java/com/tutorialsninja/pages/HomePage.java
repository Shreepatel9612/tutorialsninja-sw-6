package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksLink;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currancyDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£Pound Sterling')]")
    WebElement poundLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccountLink;


    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public void clickOnDesktop() {
        clickOnElement(desktopLink);
        log.info("Click on Desktop");
        Reporter.log("Click on Desktop");
    }

    public void mouseHoverOnLaptopsAndNotebooks() {
        clickOnElement(laptopsAndNotebooksLink);
        log.info("Mouse hover on Laptop and Notebooks and click");
        Reporter.log("Mouse hover on Laptop and Notebooks and click");
    }

    public void clickOnComponents() {
        clickOnElement(componentLink);
        Reporter.log("Click on Components");
        log.info("Click on Components");
    }

    public void clickOnCurrancy() {
        clickOnElement(currancyDropDown);
        log.info("Select currancy" + currancyDropDown + "from ram dropdown " + currancyDropDown.toString() + "<br>");
        Reporter.log("Select currancy" + currancyDropDown + "from ram dropdown " + currancyDropDown.toString() + "<br>");
    }

    public void mouseHoverOnPoundCurrancy() {
        mouseHoverToElement(poundLink);
        log.info("Select pound" + poundLink + "from ram dropdown " + poundLink.toString() + "<br>");
        Reporter.log("Select pound" + poundLink + "from ram dropdown " + poundLink.toString() + "<br>");
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccountLink);
        log.info("click on my accoutn link");
        Reporter.log("click on my accoutn link");
    }

}


