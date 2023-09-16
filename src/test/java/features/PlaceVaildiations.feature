Feature: Validating place Api's

  Scenario: verify if place is being successfully added using place Api
    Given Add place payload
    When user call "AddPlace" with post https request
    Then The api call got success with status code 200
    And "Status" in response body is "ok"
    And "Scope" in resonse body is "App"
