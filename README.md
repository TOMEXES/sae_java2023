JEDOROWICZ TOM 1213800
VICTOR MANOHARAN RONISTAN 12202748


Bonjour,

Nous avons réalisé cette SAE JAVA pour afficher une ardoise qui affiche des formes. Le projet JAVA se trouve dans sae_ardoise.zip.



Il y a 6 classes : Chapeau, Triangle, Quadrilatère, Etoile, Maison et TestArdoise.

TOM, c'est occuper pour importer ardoise.jar, mais quand il avait exécuter, il avait des problèmes : eclipse ne trouver pas les classes PointPlan ... . Puis RONISTAN a résolu ce problème d'importation.

La classe Chapeau : à était réaliser par nous deux individuellement puis nous avons mit en commun pour n'en faire qu'un. Au début, nous n'arrivions pas à utiliser ArrayList pour ajoute de nouvelle Segment, mais nous avons fait des recherches sur Internet + demander des exemples à l'intelligence artificielle. Et c'est ensuite que nous avons réussi.

La classe Triangle a été réalisée par TOM. Et puisque nous avions réussi à utiliser ArrayList et la méthode dessiner() dans la classe Chapeau. Il n'avait pas de problème à concevoir cette classe.

La classe Quadrilatère a été réalisée par RONISTAN. Tous comme pour l'autre classe Triangle, elle n'a pas posé de problème.

La classe Etoile a été réalisée par nous deux. Cependant, cette classe n'existait pas dans la phase 1 parce que nous pensions que les formes étoiles étaient composer de 4 chapeaux, donc nous pensions que cette forme fait partie de le classe chapeau. Puis quand il fallait déplacer les oiseaux dans la question 4 du phase 1, nous avons compris qu'il y avait une erreur avec la forme étoile. Donc nous avons créé cette classe Etoile.

Cette classe Maison, nous avons réalisé pour les formes composées dans la phase 2. Cette classe, nous avons réalisé ensemble. Mais nous avons étaient aider. Nous avions des problèmes avec ArrayListe dessiner() , parce que pour ajouter, il fallait faire addAll et nous on n'arrivait pas.

Ensuite la classe TestArdoise, c'est RONISTAN qui a réalisé cette classe. Il a réalisé cette classe avec la javadoc fournie. Mais il a eu des problèmes quand il fallait faire bouger les oiseaux (10, 20) , ou plutôt quand il fallait attendre 1 seconde. Il a fait des recherches sur Internet et demander de l'aide à 2 de ces camarades de classe. Et ils ont montré comment faire sleep et import java.lang.Thread; . Mais cela ne fonctionner pas, quand on exécute la classe TestArdoise , l'IDE Eclipse indique qu'il faut ajouter throws InterruptedException sinon elle ne fonctionnera pas.

Pour la phase 3, on n'a pas réussi à faire même avec le cours sur les Exceptions puis nous avons créer pour chaque classe Junit Test Case. Et nous avons fait des recherches sur Internet comment faire. Il y avait des indications avec Try ... catch , mais nous n'avons pas réussi. Et finalement nous avons demander a l'intelligence artificielle de nous aider. 
