Feature: SalesForce Test

  Scenario: Eduardo's test
    Given a user is logged into SalesForce
    When the user opens Sales
    And creates a new Lead
    And checks Details
    And converts the Lead
    And modifies the Opportunity
    And closes the Lead
