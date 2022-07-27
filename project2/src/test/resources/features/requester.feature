Feature: Requesters should be able to create a reimbursement request

    Scenario: As a requester I want to view previous reimbursement requests so I can see whether to expect money back or not

        Given   the requester is on the requester homepage
        Then    the requester should see the reimbersement table

    Scenario: As a requester I want to create a reimbursement request so I can get money back I sepent for the company

        Given   the requester is on the requester page
        When    the requester enters their reimbursement request description not exceeding 500 characters
        When    the requester enters their reimbursement request amount not exceeding 1000
        When    the requester clicks the submit button
        Then    the requester should have recieved an alert of created reimbursement request


    Scenario: As a requester I want don't want to see other employee's requests

        Given   the requester is on the requester page
        Then    the requester should not see other employee requests