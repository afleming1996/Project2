Feature: Employees should be able to login to their accounts

    Scenario: As an manager I want to sign in so I can view my custom homepage

        Given   the manager is on the login page
        When    the manager enters his correct username
        When    the manager enters his correct password
        When    the manager clicks the login button
        Then    the manager should be logged in the manager page

    Scenario: As an requester I want to sign in so I can view my custom homepage

        Given   the employee is on the login page
        When    the employee enters his correct username
        When    the employee enters his correct password
        When    the employee clicks the login button
        Then    the employee should be logged in the requester page




   