Feature: Je selectionne un choix au select menu
  Entant que utilisateur je souhaite selectionne un choix au select menu

  @select-menu
  Scenario: Je selectionne un choix au select menu
    Given je me connecte sur le site demoqa select menu
    When je selectionne le choix black au select menu
    Then l element black est selectionné "Black"