package com.project2.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequesterSteps {
    //File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/requester.html
    //File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    // C:/git/Project2/project2/src/main/resources/web-pages/requester.html
    // C:/git/Project2/project2/src/main/resources/web-pages/manager.html

    @Given("the requester is on the requester page")
    public void the_requester_is_on_the_requester_page() {
        TestRunner.driver.get("File://C:/git/Project2/project2/src/main/resources/web-pages/requester.html");
    }

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

    //view reimbursement request

    @Given("the requester is on the requester homepage")
    public void the_requester_is_on_the_requester_homepage() {

        TestRunner.driver.get("File://C:/git/Project2/project2/src/main/resources/web-pages/requester.html");


}

    @Then("the requester should see the pending reimbersement requests")
    public void the_requester_should_see_the_pending_reimbersement_requests() {

        TestRunner.driver.get("File://C:/git/Project2/project2/src/main/resources/web-pages/requester.html");


}

    @When("the requester enters a reason exceeding {int} characters")
    public void the_requester_enters_a_reason_exceeding_characters(Integer int1) {
        TestRunner.requester.EnterReimbursementDescription("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus");
    }
    @When("the requester enters an amount exceeding 1000")
    public void the_requester_enters_an_ammount_exceeding_1000(Integer int1) {
        TestRunner.requester.EnterRequestAmount(1001);
    }
    @When("the employee clicks the submit button for negative test")
    public void the_requester_clicks_the_submit_button_for_negative_test() {
        TestRunner.requester.clickButton();
    }
    @Then("the manager should see an error message")
    public void the_manager_should_see_an_error_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alert= TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Too many Characters.", alert);
        TestRunner.driver.switchTo().alert().accept();
    }










    // view only user requests

    @Then("the requester should not see other employee requests")
    public void the_requester_should_not_see_other_employee_requests(){
        TestRunner.driver.findElement(By.id("username"));
        String imposterName = TestRunner.driver.switchTo().activeElement().getText();
        Assert.assertEquals("themagicword", imposterName);
    }

}
