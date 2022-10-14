<title> Création d'un microservice avec sa documentation swagger</title>

<h2>Les dépendances utlisées:</h2>
Spring web -> pour créer une application web spring MVC
Spring Data JPA-> il regroupe  : JPA , hebernate,spring data-> mapping des objets relationnels
h2 database-> création de la base des donnes  mémoire
lombok-> getters et setters
Rest Repositories->création web service

<h2>Les dossiers nécessaires dans le projet:</h2>
entities--> class BankAccount
enums--> AccountType
repository --> BankAccountRepository
web-->bankAccountRestController( Mapping)


<h2>Résultats:</h2>
Il y a 2 méthodes pour créer un web service :
Utilisation de Spring data rest (@RepositoryRestResource) pour les traitements simples (CRUD operations)
Pour afficher le fichier JSON , on écrit :http://localhost:8082/bankAccounts
<img src="Images/dataRest.png">
ou
Un restController (@RestController)
pour les traitements complexes qui font l'appel a la couche service
Pour afficher le fichier JSON, on écrit :http://localhost:8082/api/bankAccounts
<img src="Images/restController.png">