# Proyecto demo para testing 

### 1. Crear proyecto

`mvn archetype:generate  -DgroupId=com.cecum.testing -DartifactId=testing-demo -Dversion=1.0.0-SNAPSHOT`

### 2. Agregar gitignore

`mvn eclipse:clean
touch .gitignore && echo '.classpath' >> .gitignore &&  echo '.project' >> .gitignore && echo '.vscode' >> .gitignore && echo '.settings' >> .gitignore && echo '.DS_Store' >> .gitignore && echo 'target/' >> .gitignore`
