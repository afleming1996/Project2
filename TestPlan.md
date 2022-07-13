# Test Plan

## Employee Reimbursement System
### Introduction
- Build Success is a software development team that is contracted to build an employee reimbursement system for a builder company called Big Builders Industeries. The development team will test and build the system from ground up. The system will have a three tiered web application that will contain an API, a service layer, and a repostiory layer.  

###  Objectives and Tasks
- Objectives: Teams will be building and testing an employee reimbursement system for Big Builders Industries.
- Tasks: The employee reimbursement system will be built from the ground up using the Behavior Driven Development and Test Driven Development practices as a guide. The team will build the UI and write the automation tests for this system. Finally, the team will break down the high level user stories into smaller user stories where needed and the create the Acceptance Criteria for the user stories.
### Software Development Team / BUILD SUCCESS
    - Austin Fleming
    - Sherrita Coleman
    - Richard Hensel
    - Seble Shewaneh
### Testing Requirements
- Unit Testing: 
take a single piece of the application's code logic, test it in isolation, and check if the code logic works as intended. 
    - Repository Layer Testing: handles interacting with the database
        - 1 Positive Test: check that the code logic is correct
    - Service Layer Testing: handles interacting with the database
        - 1 Negative Test: check that the business logic and common errors are handled correctly.
            - Use Mockito to stub the methods for your tests
- Integration Testing 
    - API: handles HTTP requests and responses
        - verbs
            - GET: used when retrieving information
            - POST: used when creating information
            - PATCH: used when updating information or logging in
        - routes
        - naming convention should be consistent
            - /reimbursements can be used for getting, creating, and updating reimbursements by changing which verb is used in the HTTP request
            - if updating a specific reimburesement you should also add an identifier to the route to indicate which specific reimbursement is being updated
             - /reimbursements/{id}
                - All routes must have one positive test
                - All routes must have a negative test for each business rule(if applicable)
- End to End Testing: tests the entirety of the application and validates whether everything is working together as intended or not.
    - All Acceptance criterial must be tested via Cucumber and Selenium
## 