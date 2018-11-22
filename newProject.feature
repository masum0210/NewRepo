
Feature: Buy a product
  

  @smoke
  Scenario: endToEnd
    Given open Browser
    |chrome|
    |firefox|
    |ie|
    
    And navigate to url
    When I click on menu
    And I click silk menu
    And I click first product
    And select color

  
