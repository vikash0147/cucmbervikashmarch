Feature: Free CRM login feature

Background: Login into sauce demo
		Given user is already on login page
    When title of login page is Free CRM
   
  Scenario Outline: Login into sauce demo
  	Given user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page    
    Then user add backback page
    Then verify product added in the cart
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser

    Examples: 
      | username         						| password 			| firstname | lastname | position |
      | standard_user    						| secret_sauce 	| Tom       | Peter    | Manager  |
      | problem_user                | secret_sauce  | Tommy     |Dsouza    | Director |
      | performance_glitch_user     | secret_sauce  | David     | Dsouza   | Director |