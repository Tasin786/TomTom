Feature: This feature is for verify loging activity

@nice
Scenario: Verify user login
Given Open banking "<URL>" application
When Click account link
When Enter user name and password and Click login
Then verify user login successfully 