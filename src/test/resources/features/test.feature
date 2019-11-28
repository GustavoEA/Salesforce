Feature: Salesforce Test


  Scenario: Eduardo's test
    Given a user is logged into "Salesforce"
    When the user opens "Sales"
    And creates a new "Lead"
    And checks "Details"
    And checks "More actions"
    And converts the "Lead"
    And modifies the "Opportunity"
    And closes the "Lead"
    Then the user should see the lead created and closed "whatever"


