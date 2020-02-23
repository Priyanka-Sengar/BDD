
Feature: Title of your feature
  I want to use this template for my feature file
@Tagname
  Scenario Outline: Title of your scenario
    Given User launch website daxko.com
    When user entering Username <Username> 
    And password <Password>
    Then User successfully login
    
    
    @Tagname1
  Scenario Outline: Title of your scenario
    Given User launch website daxko.com
    When user entering Username <Username> 
    And password <Password>
    Then User successfully login
 
 

  

    Examples: 
      | Username | Password | 
      | rcruz |    rcruz | 
      | mwalton |    mwalton | 
