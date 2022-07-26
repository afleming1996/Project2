package com.project2.pom;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.an.E;

public class Requester {

    private WebDriver driver;

    @FindBy(id = "inputReason")
    public WebElement reimbursementDescription;

    @FindBy(id = "amountInput")
    public WebElement requestAmount;

    @FindBy(id = "requestButton")
    public WebElement button;

    public Alert alert;

    public Requester(WebDriver driver){
        this.driver= driver;

        // the page factory is provided by with selenium
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

    {}
}
