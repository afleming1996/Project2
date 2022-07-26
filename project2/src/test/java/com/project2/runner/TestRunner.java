package com.project2.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

// import com.project2.pom.LogOut;
import com.project2.pom.Login;
import com.project2.pom.Manager;
import com.project2.pom.Requester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue= "com/project2/steps", plugin = "pretty")
public class TestRunner {

    public static WebDriver driver;
    public static WebDriverWait wait;
    

    public static Login login;
    // public static LogOut logout;
    public static Manager manager;
    public static Requester requester;
    
   

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        login=new Login(driver);
        // logout=new LogOut(driver);
        manager=new Manager(driver);
        requester=new Requester(driver);

        wait=new WebDriverWait(driver, 5);
        


        
    }
    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    

    
}

    




    


