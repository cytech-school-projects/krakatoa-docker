# krakatoa-docker
Image docker contenant le logiciel krakatoa pour le cours de vérification.

## Mode d'emploi
1. Mettre tous vos fichiers java dans le dossier `src/` (ils seront tous copiés dans l'image).
2. Modifier dans le `Dockerfile` le nom du fichier à tester (`CMD ["krakatoa", "<fichier>"]`).
3. Lancer le conteneur : `docker-compose up`.