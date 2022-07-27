package com.project2.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequesterSteps {
    //File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    //C:/Users/Tkoo/Desktop/Revature_VisualCode/Project2/Project2/project2/src/main/resources/web-pages/requester.html
    //File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/requester.html
    // C:/git/Project2/project2/src/main/resources/web-pages/manager.html
    @Given("the requester is on the requester page")
    public void the_requester_is_on_the_requester_page() {
        TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/requester.html");
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
        TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Project2/project2/src/main/resources/web-pages/requester.html");

}

    @Then("the requester should see the pending reimbersement requests")
    public void the_requester_should_see_the_pending_reimbersement_requests() {
        

}


}
