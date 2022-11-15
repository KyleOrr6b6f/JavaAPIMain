Feature: Testing the user

    Scenario: Test the name of the user
        Given Name the user as "Steve"
        When I will check the user name
        Then The user name is "Steve"