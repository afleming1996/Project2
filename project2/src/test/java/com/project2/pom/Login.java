
package com.project2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver;

    @FindBy(id = "userInput")
    public WebElement usernameInput;

    @FindBy(id = "passInput")
    public WebElement passwordInput;

    @FindBy(id = "btn")
    public WebElement loginButton;

    public Login(WebDriver driver){
        this.driver= driver;

        // the page factory is provided by with selenium
        PageFactory.initElements(driver, this);
    }   


    //methods

    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void ClickloginButton(){
        this.loginButton.click();
    }
    
}