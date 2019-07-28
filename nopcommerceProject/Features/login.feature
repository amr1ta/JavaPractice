Feature: Login

Scenario: Log in validation to nop commerce
	Given User launch Chrome Browser
	When user opens url "https://www.nopcommerce.com/login.aspx"
	And user enters username as "amtesting" and password as "test@1234"
	And click on Login
	Then page title should be "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution"
	Then logout
	And close bowser
	
	
Scenario Outline: Log in datadriven
	Given User launch Chrome Browser
	When user opens url "https://www.nopcommerce.com/login.aspx"
	And user enters username as "<user>" and password as "<password>"
	And click on Login
	Then page title should be "nopCommerce - ASP.NET Open-source Ecommerce Shopping Cart Solution"
	Then logout
	And close bowser
	
	Examples:
	| user    |  password  |
	|amtesting|  test@1234|
	|admin2   |      test123|
	|admin@yourstore.com| admin|
	
	
	
