package com.project2.pom;

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

    public void clickButton(){
        this.button.click();
    }

    
}
