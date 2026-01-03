Feature: Importer un fichier dans un site web
ETQ je souhaite Importer un fichier dans un site web.

@upload-file
Scenario: Importer un fichier dans un site web
Given je suis dans le site demo guru99
When je choisi un fichier a remonter "C:\\Users\\Mohamed\\OneDrive\\Bureau\\Formation\\proservices\\data\\test.txt"
And je coche le checkbox terms
And je click sur le bouton submit file
Then le fichier est importé "has been successfully uploaded"