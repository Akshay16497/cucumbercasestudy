

Feature: Login
Login should be quick

   Scenario: Successful Login
 	 Registered user should be able to Login
   Given I have chosen to Login
   
	When  I have valid Username and Password
	And I have clicked on login button
	Then I should be able to  access facebook
	And I should see greeting message