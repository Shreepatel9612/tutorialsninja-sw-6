package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Components']")
    WebElement componentsText;


    public String componentText() {
        getTextFromElement(componentsText);
        Reporter.log("Get component text : ");
        log.info("Get component text : ");
        return getTextFromElement(componentsText);
    }
}
