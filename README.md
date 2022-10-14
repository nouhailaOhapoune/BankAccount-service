<h1>Création d'un microservice avec sa documentation swagger</h1>

<h2>Les dépendances utlisées:</h2>
Spring web -> pour créer une application web spring MVC <br>
Spring Data JPA-> il regroupe  : JPA , hebernate,spring data-> mapping des objets relationnels <br>
h2 database-> création de la base des donnes  mémoire <br>
lombok-> getters et setters <br>
Rest Repositories->création web service <br>

<h2>Les dossiers nécessaires dans le projet:</h2>
entities--> class BankAccount <br>
enums--> AccountType <br>
repository --> BankAccountRepository <br>
web-->bankAccountRestController( Mapping) <br>


<h2>Résultats:</h2>
On peut voir la base des données sur l'interface web 'h2 console' <br><br>
<img src="Images/h2-console.png"> <br>
Et pour tester le fichier JSON (avec CRUD OPERATIONS) , on a utilisé en premier 'postman' <br><br>
<img src="Images/postMan.png"> <br>

Il y a 2 méthodes pour créer un web service : <br>
Utilisation de Spring data rest (@RepositoryRestResource) pour les traitements simples (CRUD operations) <br>
Pour afficher le fichier JSON , on écrit :http://localhost:8082/bankAccounts <br><br>
<img src="Images/dataRest.png"> <br>
ou <br>
Un restController (@RestController) <br>
pour les traitements complexes qui font l'appel a la couche service <br>
Pour afficher le fichier JSON, on écrit :http://localhost:8082/api/bankAccounts <br><br>
<img src="Images/restController.png"> <br>
 
<h3> Swagger</h3>
Pour les API restul ,il faut créer la docummentation 'swagger' <br>
en ajoutant la dépendance : spring boot openapi maven dependency <br>
(SpringDoc OpenAPI UI » 1.6.11) <br><br>
<img src="Images/swagger.png"> <br>
<b>Important:</b>
http://localhost:8082/v3/api-docs : documentation de l'api .
On peut l'importer dans 'postman' pour avoir tous les méthodes réalisées.