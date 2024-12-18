package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I mouse hover on {string} tab and click")
    public void iMouseHoverOnTabAndClick(String desktop) {
        new HomePage().clickOnDesktop();
    }

    @And("I select the menu {string}")
    public void iSelectTheMenu(String showAll) {
        new DesktopsPage().clickOnShowAll();
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String desktopText) {
        Assert.assertEquals(new DesktopsPage().desktopText(),desktopText);
    }
}
