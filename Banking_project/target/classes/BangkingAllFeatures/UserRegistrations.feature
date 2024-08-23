Feature: This feature is for registrations activit

Scenario: Verify user registrations
Given Open banking "<URL>" application
When Click account link
When Enter user name and password and Click registrations
Then Verify  registrations successfully 