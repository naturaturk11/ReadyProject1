package com.vaga.pages;

import com.vaga.utilities.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GirişYapPage {

    public GirişYapPage() {
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/section/div[3]/div/div/form/button")
    public WebElement girişYapButton;

    @FindBy(xpath = "//input[@id='ric']")
    public WebElement dogrulamaKodBloku;

}