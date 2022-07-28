Feature: Managers should be able to update the status of reimbursement requests 

    Scenario: As a manager I want to be able to view reimbursement requests so I can start addressing them

        Given   the manager is on the manager homepage
        Then    the manager should see the pending reimbersement requests

    Scenario: As a manager I want to be able to approve reimbusement requests so the company knowns whether to pay out or not

        Given   the manager is on the manager homepage
        When    the manager clicks the approve selection
        When    the manager enters a reason not exceeding 500 characters
        When    the manager clicks the submit button
        Then    the manager should have approved the reimbursement request

    Scenario: As a manager I want to be able to deny reimbusement requests so the company knowns whether to pay out or not

        Given   the manager is on the manager homepage
        When    the manager clicks the deny selection
        When    the manager enters a reason not exceeding 500 characters
        When    the manager clicks the submit button for Deny
        Then    the manager should have denied the reimbursement request

    Scenario: As a manager I view global reimbursement statistics so I can see how much money the company has given in reimburesments
        Given   the manager is on the manager homepage 
        When    the manager clicks the show globalreimbursement button
        Then    the global reimbursement company has given should be showed

    Scenario: As a manager I view my reimbursement statistics so I can see how much money I have given in reimburesments
        Given   the manager is on the manager homepage 
        When    the manager clicks the show myApprovedreimbursement button
        Then    the total amount approved reimbursement by manager should be showed

    Scenario: As a manager I don't want to be able to exceed 500 characters in the reason

        Given   the manager is on the manager homepage
        When    the manager enters a reason exceeding 500 characters
        When    the manager clicks the submit button for negative test
        Then    the manager should see an error message

