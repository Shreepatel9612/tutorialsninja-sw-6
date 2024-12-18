@regression
Feature: Laptops and Notebooks Test

  @smoke
  Scenario: Verify Products Price Display High To Low Successfully
    Given I hover over "Laptops & Notebooks" tab
    When I click on "Show All Laptops & Notebooks"
    And I sort products by "Price (High > Low)"
    Then I should see products sorted in descending price order

  @sanity
  Scenario: Verify That User Place Order Successfully
    Given I hover over "Laptops & Notebooks" tab
    When I click on "Show All Laptops & Notebooks"
    And I sort products by "Price (High > Low)"
    And I select the product "MacBook"
    Then I should see the text "MacBook"
    When I click on the "Add To Cart" button
    Then I should see the success message "Success: You have added MacBook to your shopping cart!"
    When I click on the "shopping cart" link in the success message
    Then I should see the text "Shopping Cart"
    And I should see the product name "MacBook"
    When I update the quantity to "2"
    And I click on the "Update" button
    Then I should see the message "Success: You have modified your shopping cart!"
    And I should see the total "£737.45"
    When I click on the "Checkout" button
    Then I should see the text "Checkout"
    And I should see the text "New Customer"
    When I select "Guest Checkout" option
    And I click on the "Continue" button
    And I fill the mandatory fields
    And I add comments about my order
    And I accept the Terms & Conditions
    And I click on the "Continue" button
    Then I should see the warning message "Warning: Payment method required!"
