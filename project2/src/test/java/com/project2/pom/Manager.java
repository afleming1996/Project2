package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    

    private WebDriver driver;

        @FindBy(id = "status${request.id}")
        public WebElement status;

        @FindBy(id = "status_reason${request.id}")
        public WebElement enterReason;

        @FindBy(id = "update_status_button${request.id}")
        public WebElement updateStatusButton;

        @FindBy(id = "logout")
        public WebElement logoutButton;


        public Manager(WebDriver driver){
            this.driver= driver;        
            PageFactory.initElements(driver, this);
    }

        public void enterReason(String text){
            this.enterReason.sendKeys(text);
    }

        public void clickStatus(){
            this.status.click();
    }

        public void clickSubmit(){
            this.updateStatusButton.click();
    }

        public void clickLogOutBtn(){
            this.logoutButton.click();
    }

}
