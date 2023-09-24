Feature: Payment functionality

  Scenario: Order and payment

    Given Navigate to Cleverppc
    When Click login button
    Then Enter email and password
    And Click buttons of payment
    When Click PayPal button
    Then Negative message should be displayed
    And Navigate to back
    When Click creditcard button
    Then Invalid message should be displayed
    When Click pay by bank wire button
    Then Total amount should be confirmed
    When Click confirm order button
    Then Payment success message should be displayed
    And Save the reference number






