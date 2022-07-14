Feature: Employees should provide proper information with request submissions and updates

    Scenario: As a requester, I want to povide proper information to justify my reimbursement request

        Given   the requester is on the requests page
        When    the requester enters a dollar amount not exceeding 1000
        When    the requester enters a reason not exceeding 500 characters
        Then    the request should submit

    Scenario: As a manager, I want to provide a reason to justify my decision on the status change

        Given   the manager is on the manager page
        When    the manager enters a reason not exceeding 500 characters
        Then    the status of the reqiest should update