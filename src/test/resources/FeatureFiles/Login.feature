Feature: Login functionality scenario
	@Login  @One
	Scenario: Verify wheather the user is able to login with valid credentials
		Given I launch the application
		And I navigate to account login page
		When I enter username "puneet.singh1@gmail.com" and password "Test123"
		Then I should see user is able to login successfully
		
	@Login  @Two
	Scenario: Verify wheather the user is not able to login with invalid credentials.
		Given I launch the application
		And I navigate to account login page
		When I enter username "puneet.singh1@gmail.com" and password "N@vya2009"
		Then I should see an error message that the credentials are invalid
		
	@Login  @Three	
	Scenario: Verify wheather the user is not able to login without providing credentials
	  Given I launch the application
		And I navigate to account login page
		When I enter username "" and password ""
		Then I should see an error message that the credentials are invalid
		
	@Login  @Four	
	Scenario: Verify wheather the user is able to reset the forgotten password	
	  Given I launch the application
		And I navigate to account login page
		When I reset the password for email "puneet@gmail.com"
		Then I should see a confirmation alert for sending mail for resetting password
		
		
	
		