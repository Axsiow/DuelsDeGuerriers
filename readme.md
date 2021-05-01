# Réalisation d'un jeu de Duels de Guerriers en Java

## But du DM
Réaliser un jeu en Java dans lequel le joueur a 3 guerriers et doit les faire battre contre les 3 guerriers adverses. Le déroulement du jeu et les actions des guerriers doivent afficher des messages dans la console (pas d'interface graphique à développer).

Chaque guerrier a une "race" parmi : Guerrier (classique), Elfe et Nain.
Le jeu se joue via la console contre l'ordinateur (qui joue l'équipe adversaire).

Le jeu doit initialiser 6 guerriers (2 de chaque "race") avec des caractéristiques pré-définies (codées "en dur") et, en début de partie, le programme propose au joueur de choisir quels guerriers il veut dans son équipe parmi ceux encore disponibles.
De plus, avant qu'un duel commence, le jeu doit proposer au joueur de choisir le guerrier qu'il souhaite envoyer au combat (parmi les guerriers non-KO).

Il faut que le jeu soit fonctionnel quelque soit les saisies des joueurs (repérer et gérer les cas critiques en affichant des messages aux joueurs).
Par contre, cela n'a pas d'importance si le jeu n'est pas "équilibré". 

Un ZIP du package principal (contenant vos classes JAVA liées au DM, et seulement celles liées au DM) est à déposer sur le dépôt MyLearningBox prévu à cet effet avant le **Vendredi 30 avril à 19H** (seul le code source est demandé).
Et faites en sorte de m'envoyer un ZIP qui s'appelle : **NOM-Prénom-DM-Java.zip**

## Etapes du jeu
1. Détermination des équipes :
 - Au lancement du programme, le jeu commence par afficher les informations des 6 guerriers (Nom, PV, et Nombre de dés d'attaque)
 - L'ordinateur choisit au hasard un 1er guerrier parmi les 6 (qui rejoint donc l'équipe adverse)
 - Ensuite, le jeu demande au joueur de choisir un guerrier parmi les 5 guerriers restants
 - Ainsi de suite, jusqu'à que chacune des 2 équipes soit constituée de 3 guerriers

2. Lancement des duels :
 - L'ordinateur présente son 1er guerrier (le 1er qu'il a choisi) et le jeu demande au joueur de présenter un guerrier parmi les 3 de son équipe
 - Le combat se déroule automatiquement (en utilisant le système des lancers de dès) et celui-ci s'arrête quand 1 des 2 guerriers est mis KO
 - Si le guerrier KO est celui de l'ordinateur, celui-ci propose automatiquement son 2ème guerrier. Sinon, le jeu demande au joueur de présenter un autre guerrier (parmi les 2 encore disponibles)
 - Ainsi de suite jusqu'à qu'une équipe soit totalement KO (les 3 guerriers avec PV à 0)

3. Annonce de l'équipe victorieuse : Le programme du jeu annonce l'équipe gagnante, puis s'arrête.

## Attentes par rapport à ce DM
- Le programme doit avoir une classe "MainDuel" qui se trouve dans le package par défaut et qui contient une méthode "main" permettant de lancer le jeu
- Toutes les classes (Guerrier, Nain, Elfe et MainDuel) doivent se trouver dans un même package, qui devra être zippé pour le rendu
- Le jeu ne doit planter "salement" si le joueur entre des valeurs numériques absurdes (Exemple : Si le programme demande un nombre entre 1 et 3 et que le joueur renseigne 54, il faut que le programme redemande une valeur jusqu'à que le joueur saisisse une valeur valide)
- La gestion de toutes les exceptions n'est (par contre) pas demandée pour ce DM
- Chaque méthode développée doit avoir un commentaire JavaDoc (Cf. https://openclassrooms.com/fr/courses/1115306-presentation-de-la-javadoc)
- Le code doit être codé de telle manière qu'il serait facile : d'augmenter le nombre de gueriers, de définir un nouveau type de Guerrier, ...

