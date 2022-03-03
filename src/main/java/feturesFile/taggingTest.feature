Feature: CRMPRO login module 

@Functional
Scenario: to test login functionality
Given login screen window
When enter valid username and password
| Dinkar s bhagat | YashBhagatt|
Then application getting closed

@UI
Scenario: to test application logo functionality
Given login screen window
When application logo is display
Then application getting closed

@UI
Scenario: to test application text functionality
Given login screen window
When application text is display
Then application getting closed
