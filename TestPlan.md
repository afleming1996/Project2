# Test Plan

## Employee Reimbursement System

### Technologies to be used
- Java
- Maven
- JavaScript
- Selenium
- Cucumber
- JUnit
- HTML
- Hibernate
- CSS
- AWS RDS (Postgres)
- Postman

### Software Development Team / (Fantastic) BUILD SUCCESS
- Austin Fleming
- Quyen Vu
- Richard Hensel
- Jason Sainvilus


### User Stories and associated unit/service tests
- As an employee I want to sign in so I can view my custom homepage (Quyen & Richard)
    - Positive Unit tests
        - employee enters correct credentials
            - method: checkUserCredentials()
    - Negative Unit tests
        - employee enters incorrect username || password
            - method: checkCredentialNegative()

- As an employee I want to sign out so I can prevent others from accessing my information (Quyen & Richard)
    - Positive Unit tests
        - manager clicks sign out button
            - method: clickLogOutButton()
        - requestor clicks sign out button
            - method: clickLogOutButton()

- As a manager I want to be able to view reimbursement requests so I can start addressing them (Jason & Austin)
    - Positive Unit tests
        - manager views reimbursement requests
            - method: getAllRequests()
    - Negative Unit tests
        - manager views reimbursement requests
             - method: getAllRequestsNegative()

- As a manager I want to be able to approve/deny reimbursement requests so the company know whether to pay out or not (Quyen & Richard)
    - Positive Unit tests
        - manager update reimbursement requests status
            - method: statusUpdated()
            - method: getAllRequests()
    - Negative Unit tests
        - manager update reimbursement requests status
            - method: statusNotUpdated()
    - Positive Service tests
        - manager gives reason for status
            - method: statusReason()
    - Negative Service tests
        - manager gives excessive reason
            - method: statusReasonNegative()

- As a requester I want to be able to view the status of reimbursement requests so I can see how much money I have been reimbursed (Austin and Jason)
    - Positive Unit tests
        - requester views status of reimbursement requests
            - method: getMyRequests()
    - Service tests
        - requester views reimbursement requests
            - method: getMyRequests()        

- As a requester I want to create a reimbursement request so I can get money back I spent for the company (Austin and Jason)
    - Positive Unit tests
        - requester creates reimbursement request
            - method: createRequest()
    - Negative Unit tests
        - requester creates reimbursement request
            - method: createRequestNegative()
    - Positive Service tests
        - requestor gives reason for request
            - method: requestReason()
        - requestor enters amount 
            - method: requestAmount()
    - Negative Service tests
        - requester gives excessive reason
            - method: requestReasonNegativeTest()
        - requester gives excessive amount
            - method requestAmountNegativeTest()
## 