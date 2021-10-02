@automated-api-gorest
Feature: Validation of delete method

  @DeleteExistingUser @Delete
  Scenario: Send a valid Request to delete existing user
    Given client send a request to the URL to post new user
    When client send a request to the URL to delete existing user
    Then response status should be 204