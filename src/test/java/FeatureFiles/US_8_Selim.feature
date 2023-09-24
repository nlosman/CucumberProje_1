Feature: Contact functionality

  Scenario: Send email to the website

    Given Navigate to Cleverppc
    When Enter ContactUs and click button
    Then Send a message
    And  User can successfully receive the message