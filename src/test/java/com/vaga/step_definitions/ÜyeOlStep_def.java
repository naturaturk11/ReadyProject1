package com.vaga.step_definitions;

import com.github.javafaker.Faker;
import com.vaga.pages.BasePage;
import com.vaga.pages.ÜyeOlPage;
import com.vaga.utilities.ConfigurationReader;
import com.vaga.utilities.driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ÜyeOlStep_def extends BasePage {
    ÜyeOlPage üyeOlPage=new ÜyeOlPage();
    Faker faker=new Faker();

    @When("user is on the main  page")
    public void user_is_on_the_main_page() {
        driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User  clicks the Giriş Yap  Üye Ol button")
    public void user_clicks_the_giriş_yap_üye_ol_button() {
        girişYap_ÜyeOl.click();
    }

    @And("User clicks the Üye Ol button")
    public void userClicksTheÜyeOlButton() {
        üyeOlPage.üyeOlbuttonOnGirişYapPage.click();
    }
    @When("User enters the {string} into the Ad field")
    public void user_enters_the_into_the_ad_field(String name) {
      üyeOlPage.adField.sendKeys(faker.name().name());

    }
    @When("User enters the {string} into the Soyad field")
    public void user_enters_the_into_the_soyad_field(String surname) {
       üyeOlPage.soyadField.sendKeys(faker.name().lastName());
    }
    @When("User enters the {string} into the Email field")
    public void user_enters_the_into_the_email_field(String string) {
     üyeOlPage.emailField.sendKeys(faker.internet().emailAddress());
    }
    @When("User enters the {string} into the Telefon Numarası field")
    public void user_enters_the_into_the_telefon_numarası_field(String string) {
    üyeOlPage.phoneField.sendKeys(faker.phoneNumber().cellPhone());
    }
    @When("User clicks the Açık Rıza Metni button")
    public void user_clicks_the_açık_rıza_metni_button() {
    üyeOlPage.açıkRızaMetniButton.click();
    }
    @When("User clicks the Ticari İletişim İzni Metni button")
    public void user_clicks_the_ticari_iletişim_izni_metni_button() {
    üyeOlPage.TicariİletişimİzniMetnibutton.click();
    }
    @When("user clicks the Üye ol button")
    public void user_clicks_the_üye_ol_button() {
    üyeOlPage.üyeOlOnÜyeOlPage.click();
    }




    /**

                // Open the webpage with the embedded Google Map
                driver.getDriver().get("https://testb.yawa.com.tr/account/address/save-address");

                try {
                    // Locate the iframe containing the map
                    WebElement mapFrame = driver.getDriver().findElement(By.tagName("iframe"));
                    driver.getDriver().switchTo().frame(mapFrame);

                    // Get the existing marker element on the map
                    WebElement existingMarker = driver.getDriver().findElement(By.xpath("//*[@id=\"gmimap0\"]/area"));

                    // Get the coordinates of the existing marker
                    double latitude = Double.parseDouble(existingMarker.getAttribute("40.271743"));
                    double longitude = Double.parseDouble(existingMarker.getAttribute("28.954863"));

                    // Simulate a click event on the existing marker using JavaScript
                    JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
                    js.executeScript("var map = document.getElementById('yourMapId'); " +
                            "var marker = new google.maps.Marker({position: {lat: " + latitude + ", lng: " + longitude + "}, map: map});");

                    // Wait for a short time to ensure the marker is placed (adjust as needed)
                    Thread.sleep(2000);

                    // Perform any additional verifications as needed
                    System.out.println("Successfully clicked on the existing marker!");

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Switch back to default content
                    driver.getDriver().switchTo().defaultContent();

                    // Close the WebDriver
                    driver.getDriver().quit();
         **/
                }




