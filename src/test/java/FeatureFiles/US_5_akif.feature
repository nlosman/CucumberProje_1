Feature: Control Functionality
  @Product @Regression
  Scenario: Control of the number of products listed

    Given Navigate to Cleverppc
    When Click Dresses button
    Then User must verify how many products there are
    And user must verify how many items there are at the bottom of the list
    And The user must verify the number of products in the list