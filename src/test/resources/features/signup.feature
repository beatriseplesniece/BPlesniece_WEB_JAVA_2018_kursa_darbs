Feature: This feature is about sign-up

  Scenario: Successful sign-up
    Given I have opened landing page
    When I select My Account menu
      And I select Sign up button
      And I enter first name in signup form
      And I enter last name in signup form
      And I enter mobile number in signup form
      And I enter email address in signup form
      And I enter password in signup form
      And I confirm password in signup form
      And I select SIGN UP button
    Then dashboard is opened
