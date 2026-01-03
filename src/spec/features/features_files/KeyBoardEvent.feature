Feature: Remplir et envoyer le formulaire dans la page text box
ETQ utilisateur je souhaite remplir et envoyer le formulaire dans la page text box

@key-board-envent
Scenario: Remplir et envoyer le formulaire dans la page text box
Given je suis dans la page text box
When je saisie le nom complet
And je saisie l email
And je saisie l adresse
And je copie l adresse
And je clique sur le bouton pour envoyer le formulaire
Then le fomulaire est envoyé