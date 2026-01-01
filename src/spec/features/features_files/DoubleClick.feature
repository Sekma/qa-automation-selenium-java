Feature: J fait un double click sur le bouton double click me
  Entant que utilisateur je souhaite faire un double click sur le bouton double click me

  @double-click
  Scenario: Je fait un double click sur le bouton double click me
    Given je me connecte sur le site demoqa buttons
    When je clique sur le bouton double click me
    Then un message de double click est affiché "You have done a double click"