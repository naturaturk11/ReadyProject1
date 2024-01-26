package com.vaga.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vaga.utilities.driver;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(driver.getDriver(), this);
    }
   @FindBy(xpath = "//div[.='Giriş Yap / Üye Ol']")
    public WebElement girişYap_ÜyeOl;


}
