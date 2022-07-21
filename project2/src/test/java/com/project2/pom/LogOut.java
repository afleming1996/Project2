package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

    private WebDriver driver;

    @FindBy(id = "logout")
    public WebElement logoutButton;




    public LogOut(WebDriver driver){
        this.driver= driver;

        // the page factory is provided by with selenium
        PageFactory.initElements(driver, this);
    }   



    //methods

    public void clickLogOutBtn(){
        this.logoutButton.click();
    }




    
}
