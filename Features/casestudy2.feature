
Feature: Title of your feature
  I want to use this template for my feature file

 

  @tag1
  Scenario Outline: Login to Demo webshop
    Given User is on HomePage
    When User fills valid credential "<username>", "<password>"
    Then user should be able to Login

    Examples: 
      | username  | password |
      |dhdhdhda@gmail.com |  akshay123 | 
      | quwywswhha@gmail.com |     shweta123| 
