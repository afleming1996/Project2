Manager Acceptance Criteria

Feature: Managers should be able to login to access their homepages

Scenario: As a manger I want to sign in so I can view my custom homepage

Given   the manager is on the login page
When    the manager enters his correct username
When    the manager enters his correct password
When    the manager clicks the login button
Then    the manager should be logged in the manager homepage

Feature: Managers should be able to logout to the login page

Sceneario: As a manager I want to sign out so I can prevent others from accessing my information

Given   the manager is on the manager homepage
When    the manager clicks the signout button
Then	the manager should be logged out to the login page

Feature: Managers should be able to view reimbursement requests 

Scenario: As a manager I want to be able to view reimbursement requests so I can start addressing them

Given   the manager is on the manager homepage
Then	the manager should see the pending reimbersement requests

Feature: Managers should be able to approve reimbursement requests

Scenario: As a manager I want to be able to approve reimbusement requests so the company knowns whether to pay out or not

Given   the manager is on the manager homepage
When    the manager clicks the accept selection
When    the manager clicks the submit button
Then	the manager should have approved the reimbursement request

Feature: Managers should be able to deny reimbursement requests

Scenario: As a manager I want to be able to deny reimbusement requests so the company knowns whether to pay out or not

Given   the manager is on the manager homepage
When    the manager clicks the deny selection
When    the manager clicks the submit button
Then	the manager should have denied the reimbursement request 



Employee Acceptance Criteria

Feature: Employee should be able to login to access their homepages

Scenario: As an employee I want to sign in so I can view my custom homepage

Given   the employee is on the login page
When    the employee enters his correct username
When    the employee enters his correct password
When    the employee clicks the login button
Then    the employee should be logged in the manager homepage

Feature: Employees should be able to logout to the login page

Sceneario: As an Employee I want to sign out so I can prevent others from accessing my information

Given   the employee is on the employee homepage
When    the employee clicks the signout button
Then	the employee should be logged out to the login page

Feature: Employee should be able to create a reimbursement request

Sceneario: As an Employee I want to create a reimbursement request so I can get money back I sepent for the company

Given   the employee is on the employee homepage
When    the employee enters their reimbursement request description
When    the employee enters their reimbursement request amount
When    the employee clicks the submit button
Then    the employee should have created a reimbursement request


Feature: Employees should be able to view previous reimbursement requests 

Scenario: As an Employee I want to be able to view previous reimbursement requests so I can start addressing them

Given   the employee is on the employee homepage
Then	the employee should see the previous reimbersement requests