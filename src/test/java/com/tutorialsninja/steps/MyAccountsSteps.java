package com.tutorialsninja.steps;

import com.tutorialsninja.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsSteps {

    MyAccountPage myAccountsPage = new MyAccountPage();

    @Given("I click on {string} link")
    public void iClickOnLink(String linkText) {
        myAccountsPage.clickOnMyAccountLink();
    }

    @When("I select {string} from My Account options")
    public void iSelectFromMyAccountOptions(String option) {
        myAccountsPage.selectMyAccountOptions(option);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
        Assert.assertEquals(expectedText, myAccountsPage.getPageHeaderText());
    }

    @And("I enter First Name as {string}")
    public void iEnterFirstNameAs(String firstName) {
        myAccountsPage.enterFirstName(firstName);
    }

    @And("I enter Last Name as {string}")
    public void iEnterLastNameAs(String lastName) {
        myAccountsPage.enterLastName(lastName);
    }

    @And("I enter Email as {string}")
    public void iEnterEmailAs(String email) {
        myAccountsPage.enterEmail(email);
    }

    @And("I enter Telephone as {string}")
    public void iEnterTelephoneAs(String telephone) {
        myAccountsPage.enterTelephone(telephone);
    }

    @And("I enter Password as {string}")
    public void iEnterPasswordAs(String password) {
        myAccountsPage.enterPassword(password);
    }

    @And("I enter Confirm Password as {string}")
    public void iEnterConfirmPasswordAs(String confirmPassword) {
        myAccountsPage.enterConfirmPassword(confirmPassword);
    }

    @And("I select {string} for Subscribe")
    public void iSelectForSubscribe(String subscribeOption) {
        myAccountsPage.selectSubscribeOption(subscribeOption);
    }

    @And("I agree to the Privacy Policy")
    public void iAgreeToThePrivacyPolicy() {
        myAccountsPage.clickOnPrivacyPolicyCheckbox();
    }

    @And("I click on the {string} button")
    public void iClickOnTheButton(String buttonName) {
        myAccountsPage.clickOnButton(buttonName);
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, myAccountsPage.getConfirmationMessage());
    }
}
