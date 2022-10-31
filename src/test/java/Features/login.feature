Feature: Bookcart Application tests
  I want to use this template for my feature file

  #Background:
  @smoke @reg
  Scenario: Login should be success
    Given User navigate to the Bookcart application
    And user clicks on the login button
    And User enter the username as ortoni
    And User enter the password as pass1234
    When User click on the login button
    Then login should be success

  @reg
  Scenario Outline: Login should be Failed
    Given User navigate to the Bookcart application
    And user clicks on the login button
    And User enter the "<username>" as username
    And User enter the "<password>" as password
    When User click on the login button
    But login should be Failed

    @prod
    Examples: 
      | username | password   |
      | ortoni   | pass123456 |

    @qa
    Examples: 
      | username | password   |
      | ortoni   | pass123456 |

  Scenario Outline: Login should be success
    Given User navigate to the Bookcart application
    And user clicks on the login button
    And User enter the "<username>" as username
    And User enter the "<password>" as password
    When User click on the login button
    Then login should be success

    Examples: 
      | username      | password |
      | ortoni        | pass1234 |
      | mustafi011994 | Uvwx0101 |
