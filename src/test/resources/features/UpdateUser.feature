@automated-api-gorest
Feature: Validation of put method

  @UpdateExistingUser @Put
  Scenario: Send a valid Request to update existing user
    Given client send a request to the URL to post new user
    When client send a request to the URL to update existing user
    Then response status should be 200
    And response should have name matching with the request
    And response should have email matching with the request