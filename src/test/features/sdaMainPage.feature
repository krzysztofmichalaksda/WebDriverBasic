Feature: Displaying crucial elements on Sda main page

  As a user,
  I want to see crucial elements on Sda main page,
  so that I will be able to reach all main information about Sda courses

  Scenario: Check main courses displayed on main page
    When a user opens "https://sdacademy.pl" page
    Then the user should see "Java od podstaw" course
      And the user should see "Tester oprogramowania" course