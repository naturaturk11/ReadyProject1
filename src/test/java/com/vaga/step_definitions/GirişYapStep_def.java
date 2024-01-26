package com.vaga.step_definitions;

import com.github.javafaker.Faker;
import com.vaga.pages.BasePage;
import com.vaga.pages.GirişYapPage;
import com.vaga.pages.MainPage;
import com.vaga.pages.ÜyeOlPage;
import com.vaga.utilities.driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class GirişYapStep_def extends BasePage {

    GirişYapPage girişYapPage=new GirişYapPage();
    MainPage mainPage=new MainPage();
    ÜyeOlPage üyeOlPage=new ÜyeOlPage();

    Faker faker=new Faker();

    @When("User clicks the Giriş Yap button")
    public void user_clicks_the_giriş_yap_button() {
     girişYapPage.girişYapButton.click();
    }

    @And("User enters the registered phone numbers into the Telefon Numarası field")
    public void userEntersTheRegisteredPhoneNumbersIntoTheTelefonNumarasıField() throws InterruptedException {
        üyeOlPage.phoneField.click();
        Thread.sleep(3000);
        //String valueToType ="05091234567";
       // Long number=Long.parseLong(valueToType);
       // System.out.println("number = " + number);
       // ((JavascriptExecutor) driver.getDriver()).executeScript("arguments[0].value = arguments[1];",üyeOlPage.phoneField, number);
        üyeOlPage.phoneField.sendKeys("509 123 45 67");
        Thread.sleep(4000);

        //*****************************************************************


    }



    @When("User enters the first code into the verification block")
    public void user_enters_the_first_code_into_the_verification_block() throws InterruptedException {
        girişYapPage.dogrulamaKodBloku.click();
        girişYapPage.dogrulamaKodBloku.sendKeys("123456");
       // girişYapPage.dogrulamaKod1.click();
       // girişYapPage.dogrulamaKod1.sendKeys("1");
        Thread.sleep(3000);
    }


    @Then("User is on the main shopping page")
    public void userIsOnTheMainShoppingPage() {
        String actualAdress=mainPage.defaoultAdresseButton.getText();
        String expectedAdress="Is Yeri";
        System.out.println("actualAdress = " + actualAdress);
        Assert.assertEquals(expectedAdress, actualAdress);
        String acttualLocalOffice=mainPage.deafoultLocalOffice.getText();
        System.out.println("acttualLocalOffice = " + acttualLocalOffice);
        String expectedLocalOffice="Geçit Şubesi";
        Assert.assertEquals(expectedLocalOffice, acttualLocalOffice);
    }



}
