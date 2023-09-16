Feature: Login Functionality 

Scenario: Users Login with Valid Credential
Given User is on the login page
When User is enter "<username>" and "<password>"
And User click on login button 
Then User is Navigated to the home Page 
Examples: 
|username |password |
|student  |Password123 |
|Student1 |Password1   |