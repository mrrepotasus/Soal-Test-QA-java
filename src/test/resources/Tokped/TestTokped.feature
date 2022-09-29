Feature: Test Tokped

  Scenario: Shoping
    When User go to web tokopedia
    Then User search item "nvidia rtx 3060"
    And User move to last item
    And Check result