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
        //File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
        //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html
        //"File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/manager.html"
        // C:/git/Project2/project2/src/main/resources/web-pages/manager.html
        TestRunner.driver.get("C:/git/Project2/project2/src/main/resources/web-pages/manager.html");
    }
    @Then("the manager should see the pending reimbersement requests")
    public void the_manager_should_see_the_pending_reimbersement_requests() {
        TestRunner.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tablePending")));
    }

    //Manager accepts a request
    @When("the manager enters a reason not exceeding 500 characters")
    public void the_manager_enters_a_reason_not_exceeding_500_characters() {
        TestRunner.manager.statusReason("This is a test");
    }
    @When("the manager clicks the approve selection")
    public void the_manager_clicks_the_approve_selection() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tablePending")));
        Select selectDropdown = new Select(TestRunner.driver.findElement(By.className("selection")));  
        selectDropdown.selectByVisibleText("Approved");
    }
    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button() {
        TestRunner.manager.updateStatus();
    }
    @Then("the manager should have approved the reimbursement request")
    public void the_manager_should_have_approved_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Status has been changed to Approved.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    //Manager rejects a request
    @When("the manager clicks the deny selection")
    public void the_manager_clicks_the_deny_selection() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tablePending")));
        Select selectDropdown = new Select(TestRunner.driver.findElement(By.className("selection")));  
        selectDropdown.selectByVisibleText("Denied");
    }
    @When("the manager clicks the submit button for Deny")
    public void the_manager_clicks_the_submit_button_for_Deny() {
        TestRunner.manager.updateStatus();
    }
    @Then("the manager should have denied the reimbursement request")
    public void the_manager_should_have_denied_the_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Status has been changed to Denied.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    // Manager exceeds character limit
    @When("the manager enters a reason exceeding {int} characters")
    public void the_manager_enters_a_reason_exceeding_characters(Integer int1) {
        TestRunner.manager.statusReason("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus");

    }
    @When("the manager clicks the submit button for negative test")
    public void the_manager_clicks_the_submit_button_for_negative_test() {
        TestRunner.manager.updateStatus();
    }
    @Then("the manager should see an error message")
    public void the_manager_should_see_an_error_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Too many Characters.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    ////////////////////////// Stretch Goals /////////////////////////////////////////////
    
    //reimbursement totals
    @When("the manager clicks the show globalreimbursement button")
    public void the_manager_clicks_the_show_globalreimbursement_button() {
        TestRunner.manager.globalbtn.click();
    }
    @Then("the global reimbursement company has given should be showed")
    public void the_global_reimbursement_company_has_given_should_be_showed() {
        Assert.assertEquals("0", TestRunner.manager.global.getText());
    }

    @When("the manager clicks the show myApprovedreimbursement button")
    public void the_manager_clicks_the_show_myApprovedreimbursement_button() {
        TestRunner.manager.byMebtn.click();
    }
    @Then("the total amount approved reimbursement by manager should be showed")
    public void the_total_amount_approved_reimbursement_by_manager_should_be_showed() {
    Assert.assertEquals("0", TestRunner.manager.ApproveByMe.getText());
    }
}

