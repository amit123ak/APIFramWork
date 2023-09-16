Feature: Login into tutorials ninja application
@ALL @ninja
Scenario: Login into Application with vaild credential
Given I navigate to application login page 
When I entered the email as "amitgondcse@gmail.com" and password as "amit@123"
And I click on the login button
Then User should able to login
