Feature: Pre-release Smoke test

  As a tester I want to smoke test ATT Standalone.

  @wip
  Scenario: Smoke Test 1
    Given AppDirect and Standalone apps are running and I can login
    When I have gone into telephone management section
    And I am in mobile number associations edit telephone number popup
    When I enter telephone number "123"
    Then Telephone number validation should fail
    Then close test browser
