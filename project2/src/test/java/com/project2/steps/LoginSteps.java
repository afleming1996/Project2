package com.project2.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    //Manager Login Steps
    @Given("the manager is on the login page")
    public void the_manager_is_on_the_login_page() {
        TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/login.html");
    }

    @When("the manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        TestRunner.login.enterUsername("Mana");
    }

    @When("the manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        TestRunner.login.enterPassword("password");
    }

    @When("the manager clicks the login button")
    public void the_manager_clicks_the_login_button() {
        TestRunner.login.ClickloginButton();
    }

    @Then("the manager should be logged in the manager page")
    public void the_manager_should_be_logged_in_the_manager_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager"));
        String title= TestRunner.driver.getTitle();
        Assert.assertEquals("Manager", title);
    }
    
    // Employee login Steps
   
    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/login.html");

    }

    @When("the employee enters his correct username")
    public void the_employee_enters_his_correct_username() {
        TestRunner.login.enterUsername("themeditationking");
    }
    @When("the employee enters his correct password")
    public void the_employee_enters_his_correct_password() {
        TestRunner.login.enterPassword("password");
    }
    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.ClickloginButton();
    }
    @Then("the employee should be logged in the requester page")
    public void the_employee_should_be_logged_in_the_requester_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Reimbursement Requests Page"));
        String title= TestRunner.driver.getTitle();
        Assert.assertEquals("Reimbursement Requests Page", title);
    }
    
}
