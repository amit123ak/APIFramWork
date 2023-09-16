Feature: login to Omayo Application
# user wanted to know the login behaviour to understand the functionality
@ALL @Login
Scenario Outline: User should be able to login with valid credential 
Given I want to navigate to the login page 
When I  Enter the username as "<someuser>" and password as "<somepassword>"
And click on the Login button
Then User should be able to login based on "<expected>" login status 
Examples:
|someuser       |somepassword |expected | 
|arun           |1234         |failure  |
|SeleniumByArun |Test143$     |success  |
|test           |4321         |failure  |
 