Feature: Requesters should see only requests made by them

    Scenario: As a reqester, I want only to see requests made by me

        Given   the requester is on the requests page
        Then    the requests table should only show requests made by them