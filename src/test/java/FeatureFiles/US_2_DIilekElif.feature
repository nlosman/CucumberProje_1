Feature: Login functionality

  @Accounts @Smoke
  Scenario: Login with valid username and password

    Given Navigate to Cleverppc
    When Click login button
    Then Enter email and password
    Then User should login successfully