@confirm-alert
Feature: J accepte puis j annule le message alert
  Entant que utilisateur je souhaite accepter puis annuler le message alert du site demoqa

Background:
    Given je me connecte sur le site demoqa
    When je clique sur le bouton confirm alert

  @confirm-alert-accept
  Scenario: J accepte le message alert
    And j accepte le message alert
    Then un message d acceptation est affiché "Ok"
    
  @confirm-alert-cancel
  Scenario: J annule le message alert
    And j annule le message alert
    Then un message d'annulation est affiché "Cancel"