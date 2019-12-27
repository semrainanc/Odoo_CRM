

Feature: Users should be able to login

  Background:
    Given user is on login page


  @pos
  Scenario: Login as a posmanager
    When the user enters the posmanager login information


  @events
  Scenario: Login as an eventscrmmanager
    When the user enters the eventscrmmanager login information



  @crm @wip
  Scenario: Login as a crmmanager
    When the user enters the crmmanager login information

