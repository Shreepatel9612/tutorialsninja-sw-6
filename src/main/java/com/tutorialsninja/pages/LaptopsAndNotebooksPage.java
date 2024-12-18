package com.tutorialsninja.pages;

import com.tutorialsninja.demo.utility.Utility;
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

public class LaptopsAndNotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement verifyLaptopAndNotebooksText;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortDropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[4]/div[1]/div[2]/div[1]/h4[1]/a[1]")
    WebElement clickOnMacBook;

    @CacheLookup
    @FindBy(id = "//h1[contains(text(),'MacBook')]")
    WebElement macbookText;

    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement showAllLaptops;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-thumb']//p[@class='price']")
    List<WebElement> productPrices;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@name='quantity[0]']")
    WebElement quantityInput;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit' and contains(@data-original-title,'Update')]")
    WebElement updateButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success']")
    WebElement cartUpdateMessage;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-right'][last()]")
    WebElement cartTotal;

    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement checkoutButton;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Checkout']")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='New Customer']")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueGuestCheckoutButton;

    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstNameInput;

    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastNameInput;

    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailInput;

    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephoneInput;

    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address1Input;

    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement cityInput;

    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcodeInput;

    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement countryDropdown;

    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement regionDropdown;

    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueButton;

    @CacheLookup
    @FindBy(name = "comment")
    WebElement commentsTextArea;

    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsAndConditionsCheckbox;

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement finalContinueButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    WebElement warningMessage;


    public void mouseHoverOnTab(String tabName) {
        WebElement tab = driver.findElement(By.linkText(tabName));
        mouseHoverToElementAndClick(tab);
    }

    public void clickOnMenu(String menuOption) {
        clickOnElement(showAllLaptops);
    }

    public void selectSortBy(String sortOption) {
        selectByVisibleTextFromDropDown(sortByDropdown, sortOption);
    }

    public boolean isProductsSortedByPriceDescending() {
        List<Double> originalPrices = getPricesFromElements(productPrices);
        List<Double> sortedPrices = new ArrayList<>(originalPrices);
        sortedPrices.sort(Collections.reverseOrder());
        return originalPrices.equals(sortedPrices);
    }

    private List<Double> getPricesFromElements(List<WebElement> elements) {
        List<Double> prices = new ArrayList<>();
        for (WebElement element : elements) {
            prices.add(Double.parseDouble(element.getText().replace("£", "").trim()));
        }
        return prices;
    }

    public void selectProduct(String productName) {
        WebElement product = driver.findElement(By.linkText(productName));
        clickOnElement(product);
    }

    public String getProductName() {
        return getTextFromElement(macbookText);
    }

    public void clickOnButton(String buttonName) {
        if (buttonName.equalsIgnoreCase("Add To Cart")) {
            clickOnElement(addToCartButton);
        } else if (buttonName.equalsIgnoreCase("Update")) {
            clickOnElement(updateButton);
        }
    }

    public String getSuccessMessage() {
        return getTextFromElement(successMessage);
    }

    public void clickOnLinkInMessage(String linkText) {
        clickOnElement(shoppingCartLink);
    }

    public String getCartProductName() {
        WebElement productName = driver.findElement(By.xpath("//td[@class='text-left']/a"));
        return getTextFromElement(productName);
    }

    public void updateQuantity(String quantity) {
        clearTextFromField(quantityInput);
        sendTextToElement(quantityInput, quantity);
    }

    public String getCartUpdateMessage() {
        return getTextFromElement(cartUpdateMessage);
    }

    public String getCartTotal() {
        return getTextFromElement(cartTotal);
    }


    public void selectGuestCheckoutOption(String option) {
        clickOnElement(guestCheckoutRadio);
        log.info("Clicking on radio button");
        Reporter.log("Clicking on radio button");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueGuestCheckoutButton);
        log.info("Clicking on continue button");
        Reporter.log("Clicking on continue button");
    }

    public void fillMandatoryFields() {
        sendTextToElement(firstNameInput, "John");
        sendTextToElement(lastNameInput, "Doe");
        sendTextToElement(emailInput, "johndoe@example.com");
        sendTextToElement(telephoneInput, "0123456789");
        sendTextToElement(address1Input, "123 Main Street");
        sendTextToElement(cityInput, "London");
        sendTextToElement(postcodeInput, "SW1A 1AA");
        selectByVisibleTextFromDropDown(countryDropdown, "United Kingdom");
        selectByVisibleTextFromDropDown(regionDropdown, "Greater London");
        log.info("Filling all the mandatory details");
        Reporter.log("Filling all the mandatory details");
    }

    public void addOrderComments(String comments) {
        sendTextToElement(commentsTextArea, comments);
        log.info("Adding comments");
        Reporter.log("Adding comments");
    }

    public void acceptTermsAndConditions() {
        clickOnElement(termsAndConditionsCheckbox);
        log.info("Clicking on accept terms and conditions");
        Reporter.log("Clicking on accept terms and conditions");
    }

    public String getWarningMessage() {
        log.info("Getting warning message");
        Reporter.log("Getting warning message");
        return getTextFromElement(warningMessage);
    }

    public String verifyLaptopAndNotebooksText() {
        String message = getTextFromElement(verifyLaptopAndNotebooksText);
        log.info("Verify Laptop and Notebook Text" + verifyLaptopAndNotebooksText);
        Reporter.log("Verify Laptop and Notebook Text" + verifyLaptopAndNotebooksText);
        return message;
    }

    public void selectSortByPriceHighTOlow(String type) {
        selectByVisibleTextFromDropDown(sortDropDown, "Price (High > Low)");
        log.info("Clicking on High to low" + sortDropDown.toString());
        Reporter.log("Clicking on High to low" + sortDropDown.toString());
    }

    public void setClickOnMacBook() {
        clickOnElement(clickOnMacBook);
        log.info("click on Macbook");
        Reporter.log("click on Macbook");
    }

    public String verifyMacbook() {
        String message = getTextFromElement(macbookText);
        log.info("Verify Macbook" + macbookText);
        Reporter.log("Verify Macbook" + macbookText);
        return message;
    }
}
