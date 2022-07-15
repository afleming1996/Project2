# Test Plan

## Employee Reimbursement System

### Technologies to be use
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

### Software Development Team / (Fantastic) BUILD SUCCESS
- Austin Fleming
- Quyen Vu
- Richard Hensel
- Jason Sainvilus


### User Stories and associated unit/service tests
- As an employee I want to sign in so I can view my custom homepage
    - Positive Unit tests
        - employee enters correct credentials
            - method: employeeLogin()

    - Negative Unit tests
        - employee enters incorrect username || password
            - method: incorrectLogin()
       
    - Service tests
        - N/A
<!-- is handle on client side -->
- As an employee I want to sign out so I can prevent others from accessing my information
    - Positive Unit tests
        - manager clicks sign out button
            - method: managerSignOut()
        - requestor clicks sign out button
            - method: requesterSignOut()

    - Negative Unit tests
        - manager clicks sign out button
            - method: managerNotSignOut()
        - requester clicks sign out button
            - method: requesterNotSignOut()
    - Service tests
        - N/A

- As a manager I want to be able to view reimbursement requests so I can start addressing them
    - Positive Unit tests
        - manager views reimbursement requests
            - method: requestTableVisible()

    - Negative Unit tests
        - manager views reimbursement requests
             - method: requestTableNotVisible()

    - Service tests
        - N/A
- As a manager I want to be able to approve/deny reimbursement requests so the company know whether to pay out or not 
    - Positive Unit tests
        - manager update reimbursement requests status
            - method: statusUpdated()

    - Negative Unit tests
        - manager update reimbursement requests status
            - method: statusNotUpdated()
        
    - Service tests
        - manager gives reason for status
            - method: statusReason()

- As a requester I want to create a reimbursement request so I can get money back I spent for the company
    - Positive Unit tests
        - requester creates reimbursement request
            - method: createRequest()

    - Negative Unit tests
        - requester creates reimbursement request
            - method: requestNotCreated()

    - Service tests
        - requestor gives reason for request
            - method: requestReason()
        - requestor enters amount 
            - method: requestAmount()

- As a requester I want to be able to view the status of reimbursement requests so I can see how much money I have been reimbursed
    - Positive Unit tests
        - requester views status of reimbursement requests
            - method: myRequestVisible()

    - Negative Unit tests
        - requester views reimbursement requests
             - method: myRequestNotVisible()

    - Service tests
        - requester views reimbursement requests
            - method: otherRequestersNotVisible()
## 