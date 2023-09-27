Feature: Shopping Cart functionality

  Background:
    Given Navigate to Cleverppc
    When Click login button
    Then Enter email and password

  @Regression
  Scenario: Control of products added to the Cart

    When Click Dresses button
    
    Then Select a random product and Add to Cart
    And Continue Shopping

    Then Select a random product and Add to Cart
    And Continue Shopping

    Then Select a random product and Add to Cart
    And Continue Shopping

    Then Navigate to Cart
    And Check the Count of products added to the Cart
