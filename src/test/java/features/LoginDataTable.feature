Feature: Login Functionality 

Scenario: Users Login with Valid Credential
Given User is on the login page
When User is enter credential using DataTable
 |student  |Password123 |
And User click on login button 
Then User is Navigated to the home Page 
