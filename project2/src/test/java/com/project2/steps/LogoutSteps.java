package com.project2.steps;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {


    @Given("the manager is on the manager homepage")
    public void the_manager_is_on_the_manager_homepage() {
        TestRunner.driver.get("manager.html");

    }

    @When("the manager clicks the sign out button")
    public void the_manager_clicks_the_sign_out_button() {
        TestRunner.logout.clickLogOutBtn();
    }
    @Then("the manager should be logged out to the login page")
    public void the_manager_should_be_logged_out_to_the_login_page() {
        TestRunner.driver.get("login.html");
    }

    // Employee Log out

    @Given("the employee is on the requester homepage")
    public void the_employee_is_on_the_requester_homepage() {
        TestRunner.driver.get("requester.html");
    }
    
    @When("the employee clicks the sign out button")
    public void the_employee_clicks_the_sign_out_button() {
        TestRunner.logout.clickLogOutBtn();
    }
    @Then("the employee should be logged out to the login page")
    public void the_employee_should_be_logged_out_to_the_login_page() {
        TestRunner.driver.get("login.html");
    }
    
}
