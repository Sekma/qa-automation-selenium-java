Feature: Je glisse l element drag me dans l element drop here
  Entant que utilisateur je souhaite glisser l element drag me dans l element drop here

  @drag-and-drop
  Scenario: Je glisse l element drag me dans l element drop here
    Given je me connecte sur le site demoqa droppable
    When je glisse l element drag me dans l element drop here
    Then l element est déplacé un message est affiché "Dropped!"