# Exercice 1 - Gestion d'un étudiant avec tableau de notes

* La classe `Etudiant` permet de représenter un étudiant avec un identifiant, un nom, un prénom et plusieurs notes.
* L'identifiant est généré automatiquement grâce à un compteur `static` commun à tous les étudiants.
* Les notes sont stockées dans un tableau dont la capacité peut évoluer. Lorsque le tableau est rempli, un nouveau tableau plus grand est créé et les anciennes notes sont copiées.
* La moyenne est obtenue en calculant la somme des notes enregistrées puis en la divisant par le nombre de notes.
* La méthode `afficherNotes()` permet d'afficher les notes, tandis que `toString()` présente les principales informations de l'étudiant.

# Exercice 2 - Association Étudiant / Filière

* Dans cet exercice, on utilise deux classes : `Etudiant` et `Filiere`.
* Chaque étudiant possède une référence vers sa filière, tandis qu'une filière contient plusieurs étudiants dans un tableau.
* Le tableau des étudiants commence avec une capacité limitée et s'agrandit automatiquement lorsqu'il arrive à saturation.
* Lorsqu'un étudiant est ajouté à une filière, son objet est enregistré dans le tableau de la filière et sa référence vers la filière est également mise à jour.
* Cette association permet donc de naviguer dans les deux sens : connaître la filière d'un étudiant ou retrouver les étudiants appartenant à une filière.

# Exercice 3 - Gestion des articles (Catégorie / Article)

* Cet exercice présente la gestion de produits à travers deux classes : `Categorie` et `Article`.
* Une catégorie possède un identifiant, un libellé et un code permettant de l'identifier.
* Chaque article possède ses propres informations ainsi qu'une référence vers la catégorie à laquelle il est associé.
* La catégorie ne contient pas directement un tableau d'articles. Pour afficher les articles d'une catégorie, le programme parcourt les différents articles et vérifie leur catégorie.
* Cette organisation permet de regrouper les articles par catégorie lors de l'affichage.

# Exercice 4 - Gestion d'Auteurs, Livres et Bibliothèques

* Cet exercice met en relation trois classes : `Auteur`, `Livre` et `Bibliotheque`.
* Un auteur peut être associé à plusieurs livres, et chaque livre garde une référence vers son auteur.
* Lors de la création d'un livre, celui-ci est ajouté aux livres associés à son auteur.
* Une bibliothèque peut contenir plusieurs livres et un même livre peut être présent dans plusieurs bibliothèques.
* Pour éviter qu'un livre soit ajouté plusieurs fois dans la même bibliothèque, on utilise un ensemble qui ne conserve qu'une seule occurrence de chaque livre.
* Les différentes classes utilisent également des identifiants automatiques afin de distinguer les objets créés.
