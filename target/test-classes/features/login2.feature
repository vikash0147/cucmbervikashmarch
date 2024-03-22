Feature: Free CRM login feature


  Scenario Outline: Free CRM login test Sceanrio
    Given user is already on login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user moves to new contact page
    Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser

    Examples: 
      | username         						| password 			| firstname | lastname | position |
      | standard_user    						| secret_sauce 	| Tom       | Peter    | Manager  |
      | problem_user                | secret_sauce  | Tommy     |Dsouza    | Director |
      | performance_glitch_user     | secret_sauce  | David     | Dsouza   | Director |