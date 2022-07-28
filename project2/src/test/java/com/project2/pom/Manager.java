package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {

    private WebDriver driver;

        @FindBy(tagName = "button")
        public WebElement updateButton;

  
        @FindBy(id = "logout")
        public WebElement logoutButton;

        @FindBy(id = "tablePending")
        public WebElement tablePending;


        @FindBy(tagName = "alert")
        public WebElement alert;

        @FindBy(tagName = "input")
        public WebElement reasonInput;

        public Manager(WebDriver driver){
            this.driver= driver;        
            PageFactory.initElements(driver, this);
        }
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


        //////////////////////// Stretch Goals //////////////////
        @FindBy(id = "globalbtn")
        public WebElement globalbtn;
        @FindBy(id = "byMebtn")
        public WebElement byMebtn;
        @FindBy(id = "ApproveByMe")
        public WebElement ApproveByMe;
        @FindBy(id = "total")
        public WebElement global;
        public void totalClick(){
            this.globalbtn.click();
        }
        public void ApproveByMeClick(){
            this.byMebtn.click();
        }
}
