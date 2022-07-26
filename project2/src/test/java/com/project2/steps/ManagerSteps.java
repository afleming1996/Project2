package com.project2.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
    @Given("the manager is on the manager page")
    public void the_manager_is_on_the_manager_page(){

        TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html");
        TestRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("the manager enters a reason not exceeding 500 characters")
    public void the_manager_enters_a_reason_not_exceeding_500_characters() {
        TestRunner.manager.enterReason("This is a test");
    }
    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button() {
        TestRunner.manager.clickSubmit();
    }





    //Manager Login Steps
    @Then("the manager should be logged in the manager page")
    public void the_manager_should_be_logged_in_the_manager_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager"));
        String title= TestRunner.driver.getTitle();
        Assert.assertEquals("Manager", title);
    }

    //Manager accepts a request
    @When("the manager clicks the accept selection")
    public void the_manager_clicks_the_accept_selection() {
        TestRunner.manager.clickAcceptSelection();
    }
    
    @Then("the manager should have approved the reimbursement request")
    public void the_manager_should_have_approved_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("`Status for request ${id} has been changed to ${updatedStatus.value}.`", alert);
    }

    //Manager rejects a request
    @When("the manager clicks the deny selection")
    public void the_manager_clicks_the_deny_selection() {
        TestRunner.manager.clickRejectSelection();
    }
    @Then("the manager should have rejected the reimbursement request")
    public void the_manager_should_have_rejected_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("`Status for request ${id} has been changed to ${updatedStatus.value}.`", alert);
    }

}
