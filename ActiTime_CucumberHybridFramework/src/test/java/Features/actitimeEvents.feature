

Feature: ActiTime Application Events
  In this events user will perform Login and create new customer as well
  as or modify some fetaures.

  Background: This will contain common features in both scenario
  Given User should launch the browser
  Then User should open application URL
  And User should enter valid userid
  And User should enter valid password
  Then User should click On login button
  And User should verify home page title
  
@sanity
  Scenario: New Customer
    Given User should click on Task link
    And User should click on Project and customer link
    Then User should click on New customer button 
    And user should enter customer name in text box
    And user should click on create customer button
    Then user should close browser
  
@smoke  
    Scenario: Home page verify
    Given User should verify homepage Logo
    And user should click on logout link
    Then User should verify Login page title 
    Then user should close browser

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
