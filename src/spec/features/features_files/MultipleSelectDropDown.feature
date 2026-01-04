Feature: Selectionner deux choix dans un champ de selection multiple
ETQ utilisateur je souhaite selectionner deux choix dans un champ de selection multiple

@multiple-select-drop-down
Scenario: Selectionner deux choix dans un champ de selection multiple

    Given je me connecte sur le site demoqa select menu
    When je selectionne les choix "Green" et "Red" au multiple select menu
    Then les deux elements sont selectionnés