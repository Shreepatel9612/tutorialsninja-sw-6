@regression
Feature: Desktops Test

  @smoke
  Scenario: Verify Product Arrange in Alphabetical Order
    When I mouse hover on "Desktops" tab and click
    And I click on "Show All Desktops"
    And I select sort by position "Name: Z to A"
    Then I should see the products arranged in descending order

  @sanity
  Scenario Outline: Verify Product Added to Shopping Cart Successfully
    When I mouse hover on "Currency" dropdown and click
    And I select currency "£Pound Sterling"
    And I mouse hover on "Desktops" tab and click
    And I click on "Show All Desktops"
    And I select sort by position "Name: A to Z"
    And I select product "<product>"
    Then I should see the text "<product>"
    When I enter quantity "1"
    And I click on "Add to Cart" button
    Then I should see the message "Success: You have added <product> to your shopping cart!"
    When I click on the link "shopping cart" in the success message
    Then I should see the text "Shopping Cart"
    And I should see the product name "<product>"
    And I should see the model "<model>"
    And I should see the total "<price>"

    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |
