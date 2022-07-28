package com.project2.pom;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Requester {

    private WebDriver driver;

    @FindBy(id = "inputReason")
    public WebElement reimbursementDescription;

    @FindBy(id = "amountInput")
    public WebElement requestAmount;

    @FindBy(id = "requestButton")
    public WebElement button;

    @FindBy(id = "logout")
    public WebElement logoutButton;

    public Alert alert;

    public Requester(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    } 

    //methods
    public void EnterReimbursementDescription(String text){
        this.reimbursementDescription.sendKeys(text);
    }
    public void EnterRequestAmount(int number ){
        this.requestAmount.sendKeys(String.valueOf(number));
    }
    public void alert(){
        this.alert = this.driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("testing"));
        alert.accept();    
    }
    public void clickButton(){
        this.button.click();
    }
    public void clickLogOutBtn(){
        this.logoutButton.click();
    }


    /////// Stretch Goals ////////////
    @FindBy(id = "showbtn")
    public WebElement showbtn;

    @FindBy(id = "received")
    public WebElement received;
}
