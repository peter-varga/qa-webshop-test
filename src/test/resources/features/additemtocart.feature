@additemtocart
Feature: Standard user adds an item to the cart
As a standard user I want ot add an item to the cart to be able to bu something later.

  @smoke
  Scenario: Jane adds a backpack to the cart
    Given Jane is logged in as a standard user
    When Jane adds a 'backpack' to the cart
    Then Jane sees the number of items in the cart is increased by 1
    And Jane sees the add item to cart button text of 'backpack' changed to 'Remove'.
    
  @debug
  Scenario: Jane adds all items to cart
  	Given Jane is logged in as a standard user
    When Jane adds all items to the cart
    Then Jane sees there is 6 items in the cart
    And Jane sees that all items are removable.