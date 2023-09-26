Feature: Add To Cart Functionality

  @Cart @Smoke @Regression
Scenario: Add To Cart

  Given Navigate to Cleverppc
  When Click Dresses button
  Then Click Summer Dresses button
  And Click on the element in the dress category
  When Click add to cart button
  And Success message should be displayed





