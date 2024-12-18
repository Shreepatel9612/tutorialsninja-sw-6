package com.tutorialsninja.steps;

import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LaptopAndNotebooksSteps {

    LaptopsAndNotebooksPage laptopsPage = new LaptopsAndNotebooksPage();

    @Given("I hover over {string} tab")
    public void iHoverOverTab(String tabName) {
        laptopsPage.mouseHoverOnTab(tabName);
    }

    @When("I click on the {string}")
    public void iClickOn(String menuOption) {
        laptopsPage.clickOnMenu(menuOption);
    }

    @And("I sort products by {string}")
    public void iSortProductsBy(String sortOption) {
        laptopsPage.selectSortBy(sortOption);
    }

    @Then("I should see products sorted in descending price order")
    public void iShouldSeeProductsSortedInDescendingPriceOrder() {
        Assert.assertTrue(laptopsPage.isProductsSortedByPriceDescending(), "Products are not sorted by price descending!");
    }

    @And("I select the product {string}")
    public void iSelectTheProduct(String productName) {
        laptopsPage.selectProduct(productName);
    }

    @Then("I should see text {string}")
    public void iShouldSeeTheText(String expectedText) {
        Assert.assertEquals("Product name does not match!", expectedText, laptopsPage.getProductName());
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String buttonName) {
        laptopsPage.clickOnButton(buttonName);
    }

    @Then("I should see the success message {string}")
    public void iShouldSeeTheSuccessMessage(String expectedMessage) {
        Assert.assertTrue(laptopsPage.getSuccessMessage().contains(expectedMessage), "Success message is not displayed!");
    }

    @When("I click on the {string} link in the success message")
    public void iClickOnTheLinkInTheSuccessMessage(String linkText) {
        laptopsPage.clickOnLinkInMessage(linkText);
    }

    @Then("I should see product name {string}")
    public void iShouldSeeTheProductName(String expectedProductName) {
        Assert.assertEquals("Product name does not match in cart!", expectedProductName, laptopsPage.getCartProductName());
    }

    @When("I update the quantity to {string}")
    public void iUpdateTheQuantityTo(String quantity) {
        laptopsPage.updateQuantity(quantity);
    }

    @And("I click on  {string} button")
    public void iClickOnTheButtonAgain(String buttonName) {
        laptopsPage.clickOnButton(buttonName);
    }

    @Then("I should see message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        Assert.assertTrue(laptopsPage.getCartUpdateMessage().contains(expectedMessage), "Update message is not displayed!");
    }

    @Then("I should see total {string}")
    public void iShouldSeeTheTotal(String expectedTotal) {
        Assert.assertEquals("Total price does not match!", expectedTotal, laptopsPage.getCartTotal());
    }

    @Then("I should see the warning message {string}")
    public void iShouldSeeTheWarningMessage(String expectedWarning) {
        Assert.assertTrue(laptopsPage.getWarningMessage().contains(expectedWarning), "Warning message not displayed!");
    }


    @And("I select {string} option")
    public void iSelectOption(String option) {
        laptopsPage.selectGuestCheckoutOption(option);
    }

    @And("I fill the mandatory fields")
    public void iFillTheMandatoryFields() {
        laptopsPage.fillMandatoryFields();
    }

    @And("I add comments about my order")
    public void iAddCommentsAboutMyOrder() {
        laptopsPage.addOrderComments("Please handle with care!");
    }

    @And("I accept the Terms & Conditions")
    public void iAcceptTheTermsAndConditions() {
        laptopsPage.acceptTermsAndConditions();
    }
}
