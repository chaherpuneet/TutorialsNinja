Feature: Order placing scenarios

	@Order  @One
	Scenario: Verify wheather the user is able to place orders
		Given I login into the application
		When I add a product to cart and checkout
		And I place an order
		Then I should see that the order is placed successfully
		