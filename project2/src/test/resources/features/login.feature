Feature: Employees should be able to login and out of their accounts

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

    Scenario: As a manager I want to sign out so I can prevent others from accessing my information

        Given   the manager is on the manager homepage
        When    the manager clicks the sign out button
        Then    the manager should be logged out to the login page

    Scenario: As a requester I want to sign out so I can prevent others from accessing my information

        Given   the employee is on the requester homepage
        When    the employee clicks the sign out button
        Then    the employee should be logged out to the login page

    Scenario: As an employee I dont want to be logged in if I give invalid credentials
    
        Given   the employee is on the login page
        When    the employee enters an incorrect username
        When    the employee enters an incorrect password
        When    the employee clicks the login button
        Then    the employee should not be logged in

   