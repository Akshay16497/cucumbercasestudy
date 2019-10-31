
Feature: Title of your feature
  I want to use this template for my feature file


  @tag1
  Scenario Outline: Successful registration
    Given User is on home page
    And user choose to Register
    When user selects "<gender>"
    And user enters "<Firstname>","<Lastname>","<Email>","<password>"
    And user clicks on Register
    Then user Registration will be successful

    Examples: 
      | gender  | Firstname | Lastname  |Email|password|
      | M |     dharma | yam |dhdhdhda@gmail.com|akshay123|
      | F |     shweta | yam    |quwywswhha@gmail.com|shweta123|
