@login
Feature: Login to the saucelab webshop

  @smoke
  Scenario: Login as a standard user
  	Given John navigates to the loginpage
    When John logs in with username:'standard_user',password:'secret_sauce'
    Then John is redirected to the inventory.
      
  @regression
  Scenario Outline: Login unsuccessfully
    Given John navigates to the loginpage
    When John logs in with username:"<username>",password:"<password>"
    Then John sees that the login process is unsuccessful with error type:"<errorType>".

    Examples: 
      | username        | password       | errorType 				 |
      | standard_user   | secret_sauce1  | INCORRECTPASSWORD |
      | standard_user1  | secret_sauce   | INCORRECTUSERNAME |
      | standard_user   |                | MISSINGPASSWORD   |
      |     				    | secret_sauce   | MISSINGUSERNAME   |
      | locked_out_user | secret_sauce   | LOCKEDOUTUSER     |
