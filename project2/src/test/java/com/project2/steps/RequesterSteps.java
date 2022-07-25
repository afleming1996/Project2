package com.project2.steps;

import com.project2.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequesterSteps {

    @Given("the requester is on the requester page")
    public void the_requester_is_on_the_requester_page() {
        TestRunner.driver.get("File://C:/Users/sain4/Desktop/Project2/project2/src/main/resources/web-pages/requester.html");
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
    @Then("the requester should have created a reimbursement request")
    public void the_requester_should_have_created_a_reimbursement_request() {
    TestRunner.requester.clickButton();
}
    
}
