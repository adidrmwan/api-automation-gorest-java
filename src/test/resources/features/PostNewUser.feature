@automated-api-gorest
Feature: Validation of post method

  @PostNewUser @Post
  Scenario: Send a valid Request to post new user
    Given client send a request to the URL to post new user
    Then response status should be 201
    And response should have matching with request body
