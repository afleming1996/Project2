package com.project2.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
    @Given("the manager is on the manager page")
    public void the_manager_is_on_the_manager_page(){

        TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/manager.html");
        TestRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("the manager enters a reason not exceeding 500 characters")
    public void the_manager_enters_a_reason_not_exceeding_500_characters() {
        TestRunner.manager.ReasonAccept("This is a test");
    }
   
    //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html
    //"File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/manager.html"


    // //Manager Login Steps
    // @Then("the manager should be logged in the manager page")
    // public void the_manager_should_be_logged_in_the_manager_page() {
    //     TestRunner.wait.until(ExpectedConditions.titleIs("Determine Reimbursement Status"));
    //     String title= TestRunner.driver.getTitle();
    //     Assert.assertEquals("Determine Reimbursement Status", title);
    // }

    //Manager accepts a request
    @When("the manager clicks the accept selection")
    public void the_manager_clicks_the_accept_selection() {
        Select dropdown = new Select(TestRunner.driver.findElement(By.id("status_reason151")));  
        dropdown.selectByVisibleText("Approved");
        
    }
    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button() {
        TestRunner.manager.ButtonApprove();
    }

    
    @Then("the manager should have approved the reimbursement request")
    public void the_manager_should_have_approved_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("`Status for request 151 has been changed to Approved.`", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    //Manager rejects a request
    @When("the manager clicks the deny selection")
    public void the_manager_clicks_the_deny_selection() {
        Select dropdown = new Select(TestRunner.driver.findElement(By.id("status_reason102")));  
        dropdown.selectByVisibleText("Denied");
    }
    
    @Then("the manager should have rejected the reimbursement request")
    public void the_manager_should_have_rejected_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("`Status for request 102 has been changed to Denied.`", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    
    @Then("the manager should see the pending reimbersement requests")
        public void the_manager_should_see_the_pending_reimbersement_requests() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Determine Reimbursement Status"));
        String title= TestRunner.driver.getTitle();
        Assert.assertEquals("Determine Reimbursement Status", title);
    }
}