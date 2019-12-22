Feature: Calculator

  Scenario: Adding to numbers
    Given I have a calculator
    When I add 1 and 2
    Then I should get 3