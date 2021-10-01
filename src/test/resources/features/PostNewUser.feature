Feature: Validation of post method

  @GetUserDetails
  Scenario: Send a valid Request to get user details
    Given I send a request to the URL to post new user
    Then the response will return status 201
