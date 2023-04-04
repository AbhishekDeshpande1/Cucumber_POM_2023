#Author: abhishek.deshpande04@gmail.com

		@Smoke
		Feature: Test and verify End to End Checkout flow

		Background:
    Given User open application 

  	Scenario Outline:: User create account on website 
  	Given User click on new customer register button 
    When User enter personal details with Firstname as "<FirstName>",LastName as "<LastName>",Email as "<Email>",Telephone as "<TelePhone>"
    And User enter password as "<Password>" and confirm password as "<ConfirmPassword>"
    And Accept term and condition
    Then User click on continue button to create account
    And User confirm account has been created and click on continue
		And User click on continue after account got created 
		And Verify user is on My Account page
		
    	Examples: 
      | FirstName | LastName | Email | TelePhone | Password | ConfirmPassword |
      | Abhi | Deshpande | dsw9fg@aabhjsqsssa01sssaawqpadwwwwsffwopmail.com | 7876343400 | Test@123 | Test@123 |
  
  