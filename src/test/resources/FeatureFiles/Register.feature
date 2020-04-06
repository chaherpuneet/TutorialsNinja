Feature: Registration functionality scenarios
  @Register  @One
	Scenario: Verify wheather user is able to register into the application by providing the details
	
		Given I launch the application
		And I navigate to account registration page
		When I provide all the required details
			|FirstName |Puneet |
			|LastName	 |Singh|
			|Email     |puneet.singh1@gmail.com|
			|Telephone|9898765678|
			|Password|Test123|
		And I select the Privacy Policy
		And I click on Continue Button
		Then I should see that the user account has been created successfully	
		
	@Register  @Two
	Scenario: Verify the user is not allowed to register on skipping mandatory fields
		Given I launch the application
		And I navigate to account registration page
		When I click on continue button
		Then I should see that user account is not created
		And I should see the error message informing user to fill mandatory fields 
		
	@Register  @Three	
	Scenario: Verify wheather the user is able to register into the application by subscribing to Newsletter
		Given I launch the application
		And I navigate to account registration page
		When I provide all the required details
			|FirstName |Puneet |
			|LastName	 |Singh|
			|Email     |puneet.singh1@gmail.com|
			|Telephone|9898765678|
			|Password|Test123|
		And I select the Privacy Policy
		And I subscribe to the newsletter
		And I click on Continue Button
		Then I should see that the user account has been created successfully	
		
	@Register  @Four
	Scenario: Verify wheather the user is restricted from creating a duplicate account.
		Given I launch the application
		And I navigate to account registration page
		When I provide the below duplicate details.
			|FirstName |Puneet |
			|LastName	 |Singh|
			|Email     |puneet.singh1@gmail.com|
			|Telephone|9898765678|
			|Password|Test123|
		And I select the Privacy Policy
		And I click on Continue Button
		Then i should see that the user is restricted from creating duplicate account
		
			
		
		
	 
			
		
		