package com.vaga.pages;

import com.vaga.utilities.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[.='Teslimat Adresi'])[1]")
    public WebElement teslimatAdresibutton;
    @FindBy(xpath = "(//span[.='Gönderici Şube'])[1]")
    public WebElement göndericiSubeButton;
    @FindBy(xpath = "//input[@placeholder='Aramak istediğniz ürünü yazın...']")
    public WebElement searchButtonOnMainpage;
    @FindBy(css = "div[id='radix-:r1s:']")
    public WebElement basketSignAndTotalPriceButton;
    @FindBy(xpath = "/html/body/div/div[4]/div/div[1]/div[2]/div[2]/a[1]")
    public WebElement hesabımButton;
    @FindBy(xpath = "/html/body/div/div[4]/div/div[1]/div[2]/div[2]/a[2]")
    public WebElement siparişlerimButton;
    @FindBy(xpath ="/html/body/div/div[4]/div/div[1]/div[2]/div[2]/a[3]")
    public WebElement adreslerimButton;
    @FindBy(xpath = "/html/body/div/div[4]/div/div[1]/div[2]/div[2]/a[4]")
    public WebElement alışverişSepetiButton;
    @FindBy(xpath = "/html/body/div/div[3]/div[1]/div/div/button/div/div/span[2]")
    public WebElement defaoultAdresseButton;
    @FindBy(xpath ="/html/body/div/div[3]/div[1]/div/div/div[1]/div/span[3]")
    public WebElement deafoultLocalOffice;












}
