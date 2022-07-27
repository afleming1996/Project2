package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    

    private WebDriver driver;

        // @FindBy(id = "status180")
        // public WebElement statusAccept;
        // @FindBy(id = "status181")
        // public WebElement statusDeny;

        // @FindBy(id = "status180")
        // public WebElement ReasonAccept;
        // @FindBy(id = "status181")
        // public WebElement ReasonDeny;

        // @FindBy(id = "update_status_button180")
        // public WebElement ButtonApprove;
        // @FindBy(id = "update_status_button181")
        // public WebElement ButtonDeny;
        //
        @FindBy(tagName = "button")
        public WebElement updateButton;

        @FindBy(id = "logout")
        public WebElement logoutButton;

        @FindBy(id = "tablePending")
        public WebElement tablePending;

        @FindBy(tagName = "input")
        public WebElement reasonInput;

        @FindBy(tagName = "alert")
        public WebElement alert;

        // @FindBy(className = "selection")
        // public WebElement selectionDropdown;

        public Manager(WebDriver driver){
            this.driver= driver;        
            PageFactory.initElements(driver, this);
        }

        // public void ReasonAccept(String text){
        //     this.statusAccept.sendKeys(text);
        // }
        // public void ReasonDeny(String text){
        // this.statusDeny.sendKeys(text);
        // }   

    //     public void ButtonApprove(){
    //         this.ButtonApprove.click();
    //     }
    //     public void ButtonDeny(){
    //     this.ButtonDeny.click();
    //  }

        public void updateStatus(){
            this.updateButton.click();
        }

        public void statusReason(String text){
            this.reasonInput.sendKeys(text);
        }

        public void alert(){
            driver.switchTo().alert().accept();
        }

        public void clickLogOutBtn(){
            this.logoutButton.click();
        }

}
