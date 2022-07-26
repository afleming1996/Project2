package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    

    private WebDriver driver;

        @FindBy(id = "status148")
        public WebElement statusAccept;
        @FindBy(id = "status102")
        public WebElement statusDeny;

        @FindBy(id = "status_reason148")
        public WebElement ReasonAccept;

        @FindBy(id = "status_reason102")
        public WebElement ReasonDeny;

        @FindBy(id = "update_status_button151")
        public WebElement ButtonApprove;

        @FindBy(id = "update_status_button102")
        public WebElement ButtonDeny;

        @FindBy(id = "logout")
        public WebElement logoutButton;


        public Manager(WebDriver driver){
            this.driver= driver;        
            PageFactory.initElements(driver, this);
        }

        public void ReasonAccept(String text){
            this.statusAccept.sendKeys(text);
        }
        public void ReasonDeny(String text){
        this.statusDeny.sendKeys(text);
        }   

       

        public void ButtonApprove(){
            this.ButtonApprove.click();
        }
        public void ButtonDeny(){
        this.ButtonDeny.click();
     }

        public void clickLogOutBtn(){
            this.logoutButton.click();
    }

}
