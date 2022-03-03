Feature: to test hooked functionality

@First
Scenario: to check login screen with invalid credentials
Given Login screen
When enter invalid username and password
Then browser get closed

@Second
Scenario: to check login screen with invalid credentials
Given Login screen
When enter blank username and password
Then browser get closed

@Third
Scenario: to check login screen with invalid credentials
Given Login screen
When enter valid username and password
Then browser get closed