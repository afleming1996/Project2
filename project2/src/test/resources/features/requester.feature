Feature: Requesters should be able to create a reimbursement request

    Scenario: As a requester I want to view previous reimbursement requests so I can see whether to expect money back or not

        Given   the requester is on the requester page
        Then    the requester should see the pending reimbersement requests

    Scenario: As an requester I want to create a reimbursement request so I can get money back I sepent for the company

        Given   the requester is on the requester page
        When    the requester enters their reimbursement request description not exceeding 500 characters
        When    the requester enters their reimbursement request amount not exceeding 1000
        When    the requester clicks the submit button
        Then    the requester should have recieved an alert of created reimbursement request

    Scenario: As an requester I want to view my reimbursement statistics so I can see how much money I have been given in reimburesments
        Given   the requester is on the requester page
        When    the requester clicks the show amount recieved button
        Then    the total amount approved reimbursement money showed

    Scenario: As a requester I don't don't want to submit request reasons exceeding 500 characters
        Given   the requester is on the requester page
        When    the requester enters their reimbursement request description not exceeding 500 characters
        When    the requester clicks the submit button
        Then    the requester should have recieved an alert of created reimbursement request

    Scenario: As a requester I don't don't want to submit request amounts exceeding 1000 dollars
        Given   the requester is on the requester page
        When    the requester enters their reimbursement request amount not exceeding 1000
        When    the requester clicks the submit button
        Then    the requester should have recieved an alert of created reimbursement request

    