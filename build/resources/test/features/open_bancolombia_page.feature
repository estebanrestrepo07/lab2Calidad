#Autor: student
  #language:en

  Feature: Realizar una simulación de préstamo de libre inversión
    Dado que ingresé al sitio web de Bancolombia


  Scenario: go to bancolombia credit page for people
    Given User is in bancolombia people's page
    When user clicks the button to get a new credit
    Then user can see the page to get a bancolombia credit for  people

