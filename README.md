# krakatoa-docker
Image docker contenant le logiciel krakatoa pour le cours de vérification.

## Mode d'emploi
1. Mettre tous vos fichiers java dans le dossier `src/` (ils seront tous copiés dans l'image).
2. Modifier dans le `Dockerfile` le nom du fichier à tester (`CMD ["krakatoa", "<fichier>"]`).
3. Lancer le conteneur : `docker-compose up`.

## Nettoyage
1. Supprimer le conteneur : `docker-compose down`
2. Supprimer l'image : `docker rmi verif-app:latest`
3. (Optionel) Supprimer l'image ubuntu 18 : `docker rmi ubuntu:18.04`