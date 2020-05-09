Feature: Google search functionality

  As I user
  I want to be able to search info in google
  so that I will be able to read valid information

  Scenario: Check sda suggestions
    When a user opens "https://google.com" page
      And the user type "sda" in input box
    Then the user should see "sdacademy" as 2 suggestion

  Scenario: Check sda search result
    When a user opens "https://google.com" page
      And the user type "sda" in input box
      And the user click on search button
    Then the user should see sdacademy on first search result