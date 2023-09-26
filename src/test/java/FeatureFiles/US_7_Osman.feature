Feature: Payment functionality

  @Products @Checkout @Payment @Smoke @Regression
  Scenario: Order and payment

    Given Navigate to Cleverppc
    When Click login button
    Then Enter email and password

    When Click Dresses button
    Then Click Summer Dresses button
    And Click on the element in the dress category
    When Click add to cart button
    Then Go to cart
    And Click buttons of payment
      | checkout        |
      | proceedChekout  |
      | proceedChekout2 |
      | terms           |
      | proceedChekout3 |
    When Click PayPal button
    Then Negative message should be displayed
    And Navigate to back
    When Click creditcard button
    Then Invalid message should be displayed
    And Navigate to back
    When Click pay by bank wire button
    Then Total amount should be confirmed
    When Click confirm order button
    Then Payment success message should be displayed
    And Save the reference number






