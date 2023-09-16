Feature: Searching of various categories product along with product search
Background: visiting a app using guest user 
Given i visit website as a guest user
# we ve automated fully search functionality under proudct categirues
 @ALL @BookProduct @wip @smokeTest @Books
  Scenario: Search for product under book category products
   
    When i select book option from drop down
    And i click on search icon
    Then i should see book pages is loaded
    And i should see book at Amezon as heading
    But i should not see other product
    
   @ALL   @BabyProduct @Dev  @Baby
  Scenario: Search for the products under Baby category
    
    When I select the Baby option from the dropdown
    And I click on Search icon button
    Then I should see the Baby page loaded
    And I should see The baby store as heading
    But I should not see other category products
