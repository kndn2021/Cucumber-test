Feature: to check data Table functionality
Scenario: data table on Login screen window
Given Login screen window
When user enter invalid data credentials
| Kundan Dinkar Bhagat | Kunda@1234 |
Then user should get error message