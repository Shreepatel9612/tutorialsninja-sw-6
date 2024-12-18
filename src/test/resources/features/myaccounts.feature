@regression
Feature: My Accounts Test

  @smoke
  Scenario: Verify User Should Navigate to Register Page Successfully
    Given I click on "My Account" link
    When I select "Register" from My Account options
    Then I should see the text "Register Account"

  @sanity
  Scenario: Verify User Should Navigate to Login Page Successfully
    Given I click on "My Account" link
    When I select "Login" from My Account options
    Then I should see the text "Returning Customer"

  Scenario: Verify That User Register Account Successfully
    Given I click on "My Account" link
    When I select "Register" from My Account options
    And I enter First Name as "John"
    And I enter Last Name as "Doe"
    And I enter Email as "johndoe@example.com"
    And I enter Telephone as "0123456789"
    And I enter Password as "password123"
    And I enter Confirm Password as "password123"
    And I select "Yes" for Subscribe
    And I agree to the Privacy Policy
    And I click on the "Continue" button
    Then I should see the message "Your Account Has Been Created!"
    When I click on the "Continue" button
    And I click on "My Account" link
    And I select "Logout" from My Account options
    Then I should see the text "Account Logout"
    When I click on the "Continue" button

  Scenario: Verify That User Should Login and Logout Successfully
    Given I click on "My Account" link
    When I select "Login" from My Account options
    And I enter Email as "johndoe@example.com"
    And I enter Password as "password123"
    And I click on the "Login" button
    Then I should see the text "My Account"
    When I click on "My Account" link
    And I select "Logout" from My Account options
    Then I should see the text "Account Logout"
    When I click on the "Continue" button
