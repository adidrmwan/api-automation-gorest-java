@automated-api-gorest
Feature: Validation of get method

  @GetUserDetails @Get
  Scenario: Send a valid Request to get user details
    Given client send a request to the URL to post new user
    When client send a request to the URL to get user details
    Then response status should be 200
    And response should have id matching with the request