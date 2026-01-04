Feature: naviguer dans la page
ETQ utilisateur je souhaite naviguer dans la page

@navigation
Scenario: naviguer dans la page

Given je suis dans la page text box
When je defile vers le bas
And je refraiche la page
And je reviens vers la page precedente
And je passe a la page suivante
Then je suis a la page initiale