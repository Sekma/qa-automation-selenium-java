Feature: verifier le tool tip
ETQ utilisateur je souhaite verifier tool tip

@tool-tip
Scenario: verifier le tool tip

Given je suis sur la page toul tip
When je survole sur le bouton
Then le tool tip est affiché "You hovered over the Button"