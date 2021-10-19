Feature: Is the car black?
  As a user I want to know if the car is black.

  Scenario: the car is red
    Given the car is red
    When I ask if it is black
    Then I should be told "no"

  Scenario: the car is black
    Given the car is black
    When I ask if it is black
    Then I should be told "yes"