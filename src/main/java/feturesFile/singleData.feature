Feature: to test login credentials

Scenario: to test Login screen window with Single test data

Given facebook login screen window
When user enter invalid "KundanBhagat" and "Kundan@123"
Then user should get error message