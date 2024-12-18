@regression
Feature: Top Menu Navigation

  @smoke
  Scenario: verify User Should Navigate To Desktops Page Successfully
    Given I am on the homepage
    When I mouse hover on "Desktops" tab and click
    And I select the menu "Show All Desktops"
    Then I should see the text "Desktops"

  @sanity
  Scenario: verify User Should Navigate To LaptopsAndNotebooks Page Successfully
    Given I am on the homepage
    When I mouse hover on "Laptops & Notebooks" tab and click
    And I select the menu "Show All Laptops & Notebooks"
    Then I should see the text "Laptops & Notebooks"

  Scenario: verify User Should Navigate To Components Page Successfully
    Given I am on the homepage
    When I mouse hover on "Components" tab and click
    And I select the menu "Show All Components"
    Then I should see the text "Components"
