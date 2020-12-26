__Description des projets__

__*DesignPatternComportementStrategy et CanardDPComportementStrategy*__ permettent de définir une famille d’algorithmes, et encapsuler
chacun et les rendre interchangeables tout en assurant que chaque algorithme puisse évoluer indépendamment des clients qui l’utilisent.

__*DesignPatternComportementObserver*__ Le pattern observateur définit une relation entre les objets de type un à plusieurs, de
façon que, lorsqu’un objet change d’état, tous ce qui en dépendent en soient informés et soient mis à jour automatiquement.

__*DesignPatternStructureDecorateur*__ Le pattern Décorateur attache dynamiquement des responsabilités supplémentaires à un objet. Il fournit une alternative souple à la dérivation, pour étendre les fonctionnalités.

__*DesignPatternStructureComposites:*__ 
	*. Organiser les objets en structure arborescente afin de représenter une hiérarchie.
	*. Permettre à la partie cliente de manipuler un objet unique et un objet composé de la même manière.

__*DesignPatternStructureAdapter:*__ 
	*. Convertir l'interface d'une classe dans une autre interface comprise par la partie cliente.
	*. Permettre à des classes de fonctionner ensemble, ce qui n'aurait pas été possible à cause de leurs interfaces incompatibles.

__*DesignPatternStructureProxy*__ permet de fournir un intermédiaire entre la partie cliente et un objet pour contrôler les accès à ce dernier.

__*DesignPatternStructureFacade:*__ 
	*. Fournir une interface unique en remplacement d'un ensemble d'interfaces d'un sous-système.
	*. Définir une interface de haut niveau pour rendre le sous système plus simple d'utilisation.

__*DesignPatternStructureBridge:*__ 
	*. Découpler l'abstraction d'un concept de son implémentation.
	*. Permettre à l'abstraction et l'implémentation de varier indépendamment.

__*DesignPatternStructureFlyWeight*__ permet d'utiliser le partage pour gérer efficacement un grand nombre d'objets de faible granularité.

__*DesignPatternComportementStat*__ permet de changer le comportement d'un objet selon son état interne.

__*DesignPatternComportementTemplateMethod*__ permet de définir le squelette d'un algorithme en déléguant certaines étapes à des sous-classes.

__*DesignPatternComportementCommand:*__
	*. Encapsuler une requête sous la forme d' objet.
	*. Paramétrer facilement des requêtes diverses.
	*. Permettre des opérations réversibles. 

__*DesignPatternComportementMediator:*__
	*. Gérer la transmission d'informations entre des objets interagissant entre eux. 
	*. Avoir un couplage faible entre les objets puisqu'ils n'ont pas de lien direct entre eux.
	*. Pouvoir varier leur interaction indépendamment.

__Pré-requis avant exécution__

__*Installez un jdk ou au moins un jre sur son ordinateur.*__

Pour l'installation merci de suivre les étapes suivantes:
*. Rendez-vous sur la partie Java du site d'Oracle: http://www.oracle.com/technetwork/java
*. Dans la zone de droite 'software downloads', cliquez sur le lien 'Java SE' (pour Java Standard Edition)
*. Cliquez sur l'icône 'Java' pour télécharger le JDK
*. Accepter la licence
*. De préférence choisir la version la plus récente (dernière sur la liste)
*. Cliquez sur le bouton 'Enregistrer le fichier'. Le téléchargement commence
*. Double cliquez sur le fichier téléchargé. L'assistant d'installation du JDK se lance
*. Cliquez sur le bouton 'Next' des fenêtres qui vont s'afficher
*. Au moment d'installer un environnement d'exécution indépendant du JDK, l'assistant vous consulte. Acceptez les options par défaut et cliquez sur Next
*. Ainsi même si vous supprimez par la suite le répertoire d'installation du JDK (qui contient aussi une JRE), vous pourrez tout de même exécuter des programmes Java sur votre ordinateur
*. Vous arrivez à l'écran de fin d'installation qui vous précise que l'installation c'est bien déroulée.
*. Cliquez sur close pour terminer l'installation du JDK

__Installer un IDE sur son ordinateur__
 
__*Dans notre cas nous allons installer Eclipse*__

Pour l'installation merci de suivre les étapes suivantes:
*. Rendez-vous à l'adresse https://www.eclipse.org/downloads/
*. Cliquez sur le bouton Télécharger 64 bits
*. Cliquez ensuite sur Télécharger
*. Démarrez l'exécutable du programme d'installation
*. Sélectionnez le package à installer
*. Sélectionnez votre chemin d'installation
*. Lancez Eclipse 

__Version du JDK__

Java version "1.8.0_73"
Java(TM) SE Runtime Environnement (build 1.8.0_73_b02)
Java HotSpot(TM) 64-Bit Server VM (build 25.73-b02, mixed mode)

__Exécution de l'application__

__*Veuillez suivre les indications suivantes:*__
1. Téléchargez le fichier compressé Nom_projet.zip
2. Décompressez le dans votre workspace C:/Users/nom_utilisateur/eclipse-workspace
3. Démarrez Eclipse et cliquez sur file > Open Projects from File System...
4. Sélectionnez le projet que vous voulez exécuter
5. Cliquez sur finish
6. Faites un clic droit sur le nom du projet > Run AS > Java Application