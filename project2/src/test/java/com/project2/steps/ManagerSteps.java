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

        TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html");

        //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html
        //"File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/manager.html"
        // C:/git/Project2/project2/src/main/resources/web-pages/manager.html


    }

    @Then("the manager should see the pending reimbersement requests")
    public void the_manager_should_see_the_pending_reimbersement_requests() {
        TestRunner.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tablePending")));
    }

    @When("the manager enters a reason not exceeding 500 characters")
    public void the_manager_enters_a_reason_not_exceeding_500_characters() {
        TestRunner.manager.statusReason("This is a test");
    }


    //File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html
    //"File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/manager.html"
    // C:/git/Project2/project2/src/main/resources/web-pages/manager.html


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
    @Given("the manager is still on  the manager homepage")
    public void the_manager_is_still_on_the_manager_homepage() {
        TestRunner.driver.get("C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/manager.html");
    }

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


    
    @Then("the manager should see the pending reimbersement requests")
        public void the_manager_should_see_the_pending_reimbersement_requests() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Determine Reimbursement Status"));
        String title= TestRunner.driver.getTitle();
        Assert.assertEquals("Determine Reimbursement Status", title);
    }
}

