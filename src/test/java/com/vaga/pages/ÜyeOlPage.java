package com.vaga.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vaga.utilities.driver;

public class ÜyeOlPage {
    public ÜyeOlPage() {
        PageFactory.initElements(driver.getDriver(), this);
    }
    //We can start locating web elements using @FindBy annotation
@FindBy(xpath = "/html/body/section/div[3]/div/div/div[2]/div/a")
    public WebElement üyeOlbuttonOnGirişYapPage;
@FindBy(css = "input[id='name']")
    public WebElement adField;
@FindBy(css = "input[id='surname']")
    public WebElement soyadField;
@FindBy(css = "input[id='email']")
    public WebElement emailField;
@FindBy(css = "input[id='phone']")
    public WebElement phoneField;
@FindBy(xpath = "/html/body/section/div[3]/form/div/div/div[3]/button")
    public WebElement üyeOlOnÜyeOlPage;
@FindBy(xpath = "//input[@id='membershipTerms']")
    public WebElement açıkRızaMetniButton;
@FindBy(xpath = "//input[@id='commercialPermissionTerms']")
    public WebElement TicariİletişimİzniMetnibutton;





}

