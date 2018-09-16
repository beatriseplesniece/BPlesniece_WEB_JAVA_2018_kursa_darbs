Feature: This feature is about log-in in existing account

  Scenario: Successful log-in
    Given I have opened landing page
    When I am in sign up form
      And I have created new account
      And I select My account button
      And I select Log out button
      And I enter valid email address
      And I enter valid password
      And I select Login button
    Then User Account page is opened