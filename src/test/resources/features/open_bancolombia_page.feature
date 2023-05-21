#Autor: student
  #language:en

  Feature: Realizar una simulación de préstamo de libre inversión
    Dado que ingresé al sitio web de Bancolombia


  Scenario: go to bancolombia's credit page for people
    Given User is in bancolombia people's page
    When user clicks the button to get a new credit
    Then user can see the page to get a bancolombia credit for people


  Scenario: go to simulate credit page
    Given User is in the page to get a bancolombia credit for people
    When user clicks on simulate credit
    Then user can see the page to start simulate the credit

  Scenario: user fills required information to simulate the credit
    Given User is in the page to start simulate the credit
    When user fills the required information
    Then user can simulate the credit and see the results



