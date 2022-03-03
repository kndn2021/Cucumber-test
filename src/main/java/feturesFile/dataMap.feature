Feature: to check data map functionality
Scenario: data map on Login screen window
Given Login screen window
When user enter invalid username and password
| username | password |
| Kundan Dinkar Bhagat | Kunda@1234 |
| Yash Bhagat | Kunda@1234 |
Then user should get error message

