Feature: gestion de l alerte prompt
ETQ utilisateur je souhaite saisir un text dans une alerte prompt
Afin de vérifier que le message saisi est correctement affiché

@prompt-alert
Scenario: saisir un text dans une alerte prompt

Given je me connecte sur le site demoqa
When je clique sur le bouton prompt alert
And je saisie le text "<text>" dans l alert prompt
And j accepte le message alert
When le message alert prompt est affiché "<text>"

Example:
|name |
|Sekma |