package com.project2.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    //Manager Login Steps
    @Given("the manager is on the login page")
    public void the_manager_is_on_the_login_page(){
        
        TestRunner.driver.get("login.html");
        TestRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
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
        TestRunner.driver.get("login.html");

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
    

    // LogoutSteps
    // Manager log out
    @Given("the manager is on the manager homepage")
    public void the_manager_is_on_the_manager_homepage() {
        TestRunner.driver.get("manager.html");

    }
    @When("the manager clicks the sign out button")
    public void the_manager_clicks_the_sign_out_button() {
        TestRunner.logout.clickLogOutBtn();
    }

    // Requester Log out
    @Given("the employee is on the requester homepage")
    public void the_employee_is_on_the_requester_homepage() {
        TestRunner.driver.get("requester.html");
    }
    @When("the employee clicks the sign out button")
    public void the_employee_clicks_the_sign_out_button() {
        TestRunner.logout.clickLogOutBtn();
    }

    //both
    @Then("the employee should be logged out to the login page")
    public void the_employee_should_be_logged_out_to_the_login_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Login"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Login", title);
    }



}
