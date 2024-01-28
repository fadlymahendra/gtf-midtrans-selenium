Feature: Checkout using Credit Card payment method

  Background:
    Given I am on the Midtrans home page
    When I click on the buy button
    And I click on checkout button

  Scenario: Successful checkout with valid credit card
    When I click on Credit Debit Payment method
    And I input valid credit card information
    And I input and submit valid OTP
    Then Verify payment successful
    
    