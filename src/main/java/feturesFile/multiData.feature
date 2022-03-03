Feature: to test login credentials

Scenario Outline: to test Login screen window with multiple test data

Given facebook login screen window
When user enter invalid "<username>" and "<password>"
Then user should get error message
Examples: 
| username | password |
| Kundan | Bhagat |
| Raju | Karale |
| Patil | Shyam |