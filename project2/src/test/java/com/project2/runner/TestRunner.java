package com.project2.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project2.pom.LogOut;
import com.project2.pom.Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue= "com/project2/steps", plugin = "pretty")
public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait wait;
    

    public static Login login;
    public static LogOut logout;
    
   

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        login=new Login(driver);
        logout=new LogOut(driver);

        wait=new WebDriverWait(driver, 5);
        


        
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    

}

    




    


