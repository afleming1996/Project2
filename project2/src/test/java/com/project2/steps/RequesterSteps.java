package com.project2.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import junit.framework.Test;

public class RequesterSteps {
    //File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/requester.html
    //File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    // C:/git/Project2/project2/src/main/resources/web-pages/requester.html

    // view requests
    @Given("the requester is on the requester page")
    public void the_requester_is_on_the_requester_page() {

        TestRunner.driver.get("C:/git/Project2/project2/src/main/resources/web-pages/requester.html");
    }
    @Then("the requester should see the pending reimbersement requests")
    public void the_requester_should_see_the_pending_reimbersement_requests() {
        TestRunner.driver.get("C:/git/Project2/project2/src/main/resources/web-pages/requester.html");
    }

    // create requests
    @When("the requester enters their reimbursement request description not exceeding {int} characters")
    public void the_requester_enters_their_reimbursement_request_description_not_exceeding_characters(Integer int1) {
        TestRunner.requester.EnterReimbursementDescription("testing for test");
    }
    @When("the requester enters their reimbursement request amount not exceeding {int}")
    public void the_requester_enters_their_reimbursement_request_amount_not_exceeding(Integer int1) {

        TestRunner.requester.EnterRequestAmount(5);
    }
    @When("the requester clicks the submit button")
    public void the_requester_clicks_the_submit_button() {
        TestRunner.requester.clickButton();
    }
    @Then("the requester should have recieved an alert of created reimbursement request")
    public void the_requester_should_have_recieved_an_alert_of_created_reimbursement_request() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        TestRunner.driver.switchTo().alert().accept();
    }


    // negative submission requests
    @When("the requester enters their reimbursement request description exceeding 500 characters")
    public void the_requester_enters_their_reimbursement_request_description_exceeding_500_characters() {
        TestRunner.requester.EnterReimbursementDescription("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus");
    }
    @When("the requester enters their reimbursement request amount exceeding 1000")
    public void the_requester_enters_their_reimbursement_request_ammount_exceeding_1000() {
        TestRunner.requester.EnterRequestAmount(1001);
    }
    @When("the requester clicks the submit button for negative test")
    public void the_requester_clicks_the_submit_button_for_negative_test() {
        TestRunner.requester.clickButton();
    }
    @Then("the requester should have recieved an alert of excessive reason")
    public void the_requester_should_have_recieved_an_alert_of_excessive_reason() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("You are request is invalid.  Please ensure you are following the request instructions.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }
    @Then("the requester should have recieved an alert of excessive amount")
    public void the_requester_should_have_recieved_an_alert_of_excessive_amount() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("You are request is invalid.  Please ensure you are following the request instructions.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }

    // user requests only
    @Then("the requester should not see other employee requests")
    public void the_requester_should_not_see_other_employee_requests(){
        String imposterName = TestRunner.driver.findElement(By.id("username")).getText();
        Assert.assertNotEquals("themagicword", imposterName);
    }


    ///////// Stretch Goals /////////////
    @When("the requester clicks the show amount recieved button")
    public void the_requester_clicks_the_show_amount_recieved_button() {
       TestRunner.requester.showbtn();
    }
    @Then("the total amount approved reimbursement money showed")
    public void the_total_amount_approved_reimbursement_money_showed() {

        Assert.assertEquals("", TestRunner.requester.received.getText());

    }

}
