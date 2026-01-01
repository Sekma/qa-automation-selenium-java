Feature: Masquer puis afficher un champ de saisie
  Entant que utilisateur je souhaite masquer puis afficher un champ de saisie

  @hidden
  Scenario: Masquer puis afficher un champ de saisie
    
    Given je me connecte sur la page letskodeit
	When je clique sur le bouton pour masquer le champ de saisie
	And je saisis le texte "Selenium" dans le champ
	Then le texte "Selenium" est présent dans le champ même s’il est masqué
	When je clique sur le bouton pour afficher le champ de saisie
	Then le champ de saisie est visible avec le texte "Selenium"