Feature: Je fait un click droit sur le bouton right click
  Entant que utilisateur je souhaite faire un click droit sur le bouton right click

  @right-click
  Scenario: Je fait un click droit sur le bouton right click
    Given je me connecte sur le site demoqa buttons
    When je clique sur le bouton right click
    Then un message de right click est affiché "You have done a right click"