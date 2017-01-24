
Feature: Sok
  As a user I want to be able to search
  for a horse using a regnr
  Scenario:
    Given I am on the reg-search-page
    When I enter regnr "24041055"
    Then "Miranda" should show in the hitlist
