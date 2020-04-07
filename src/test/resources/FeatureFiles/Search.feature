Feature: Search functionality scenario
	
	@Search  @One
	Scenario: Verify wheather the user is able to search for the product
		Given I launch the application
		When I search for a product "Samsung SyncMaster 941BW"
		Then I should see the product in the search results
		
	@Search  @Two	
	Scenario: Verify wheather the user is informed when the product being searched is not available
		Given I launch the application
		When I search for a product "Apple iPhone"
		Then I should see a message informing "Your Shopping cart is empty!"
		