Feature: Requesters should be able to create a reimbursement request

    Scenario: As an requester I want to create a reimbursement request so I can get money back I sepent for the company

        Given   the requester is on the requester page
        When    the requester enters their reimbursement request description
        When    the requester enters their reimbursement request amount
        When    the requester clicks the submit button
        Then    the requester should have created a reimbursement request


    Scenario: As an requester I want to be able to view the status of reimbursement requests so I can see how much money I have been reimbursed for

        Given   the requester is on the requester page
        Then    the requester should see the status of previous reimbersement requests