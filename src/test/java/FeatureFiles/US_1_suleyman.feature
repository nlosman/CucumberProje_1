Feature: Register functionality

  @Accounts @Smoke @Regression
  Scenario: Create an account

    Given Navigate to Cleverppc
    When Click login button
    When Enter email
    Then Click create and account button
    And Enter information
    Then Click register button
    Then User should register successfully