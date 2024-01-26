@feature

Feature: User logs in
  Background:
    When user is on the main  page
  Scenario: User Logs in with the registered phone number
    When User  clicks the Giriş Yap  Üye Ol button
    And  User enters the registered phone numbers into the Telefon Numarası field
    And  User clicks the Giriş Yap button
    And  User enters the first code into the verification block
    Then User is on the main shopping page


