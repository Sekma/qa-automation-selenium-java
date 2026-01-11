@multi-select
Feature: gestion du multi select
  ETQ utilisateur
  Je souhaite gérer la sélection et la désélection des options

Background:
    Given je me connecte sur le site demoqa select menu
    When je sélectionne l option opel par index 2
    And je sélectionne l option "saab" par valeur
    And je sélectionne l option "Audi" par texte visible

  Scenario: sélectionner des options
    Then les options sélectionnées sont "Saab" "Opel" "Audi"

  Scenario: désélectionner des options
    When je désélectionne l option audi par index 3
    When je désélectionne l option "Opel" par texte visible
    Then seule l option "Saab" est sélectionnée
