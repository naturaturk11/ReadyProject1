@feature
Feature:Ozhan-yawa market Address creation test
  Agile story: As a user, when I am on the Yawa main   page
  I should be able to add address successfully
  Background:
   When user is on the main  page

  Scenario: User Signs in successfully
   When User  clicks the Giriş Yap  Üye Ol button
    And User clicks the Üye Ol button
    And User enters the "name" into the Ad field
    And User enters the "surname" into the Soyad field
    And User enters the "email" into the Email field
    And User enters the "phone number" into the Telefon Numarası field
    And User clicks the Açık Rıza Metni button
    And User clicks the Açık Rıza Metni button
    And User clicks the Ticari İletişim İzni Metni button
    And user clicks the Üye ol button



