Feature: Account Functionality

  @Accounts @Smoke

    Scenario: Add new address to the account

    Given Navigate to Cleverppc
    When Click login button
    Then Enter email and password

    When Click my addresses button
    Then Click add a new address button
    And User can successfully add a new address