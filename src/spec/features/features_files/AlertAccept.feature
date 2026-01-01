
Feature: J accepte le message alert
  Entant que utilisateur je souhaite accepter le message alert du site demoqa

  @alert-accept
  Scenario: J accepte le message alert
    Given je me connecte sur le site demoqa
    When je clique sur le bouton alert
    And j accepte le message alert
    Then le message alert est acceppter et je me redirige vers la page home "DEMOQA"