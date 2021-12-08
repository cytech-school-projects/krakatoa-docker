# krakatoa-docker
Image docker contenant le logiciel krakatoa pour le cours de vérification.

## Mode d'emploi
Note : il peut être nécessaire d'exécuter les commandes Docker en tant que root.
1. Mettre le fichier à vérifier dans le dossier `src/` (Attention ! Ne mettre qu'un fichier à la fois !).
2. Lancer le conteneur : `docker-compose up --build`.

## Nettoyage
1. Supprimer le conteneur : `docker-compose down`
2. Supprimer l'image : `docker rmi verif-app:latest`
3. (Optionel) Supprimer l'image ubuntu 18 : `docker rmi ubuntu:18.04`
