Feature: Employees should be able to login and out of their accounts

       Scenario: As a manager I want to sign out so I can prevent others from accessing my information

        Given   the manager is on the manager homepage
        When    the manager clicks the sign out button
        Then    the manager should be logged out to the login page

    Scenario: As a requester I want to sign out so I can prevent others from accessing my information

        Given   the employee is on the requester homepage
        When    the employee clicks the sign out button
        Then    the employee should be logged out to the login page