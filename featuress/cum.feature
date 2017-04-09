Feature: Test Facebook smoke scenario
	
	Scenario: Test Login with valid credentails
	Given Open firefox and start application
	When I entered valid username and valid password
	Then user should be able to login successfully
	
