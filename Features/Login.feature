Feature: all login scenarios

  @valid @login
  Scenario: To test the functionality of login page for valid input
    Given I am on the login page
  #  When I Enter correct username and password
    When I Enter "admin" and "admin" as username and password
    And I click on login button
    Then I should be land on dashboard

  @invalid @login @notBlank
  Scenario: To test the functionality of login page for invalid input
    Given I am on the login page
    #When I Enter incorrect username and password
    When I Enter "dsdsd" and "dsdsds" as username and password
    And I click on login button
    Then I should get an error

  @blank @login @invalid
  Scenario: To test the functionality of login page for blank input
    Given I am on the login page
   # When I Enter blank username and password
    When I Enter "" and "" as username and password
    And I click on login button
    Then I should get an error

    @userRegistration
    Scenario: to test the functionality of submit button on user registration page
      Given I am on user registration page
      When I enter below details
        | amol ujagare | amol@gmail.com | 54545454 | Pune |
      And I click on submit button
      Then user should be added