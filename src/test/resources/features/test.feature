Feature: RyanAir Exam

  Scenario: Invalid Payment
    Given A logged user access to RyanAir
    When Search for a flight to Rome
    And Go through the booking process
    Then Check the invalid payment