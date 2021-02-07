# gestao

## Recompilar dependencia
mvn clean package

## Subir aplicacao
mvn spring-boot:run

## Rodar testes
mvn test

## Subir aplicação docker 
sudo docker-compose up --build --force-recreate


API REST de produtos com Swagger-ui. Disponível em https://dashboard.heroku.com/apps/sigo-back-gestao/swagger-ui.html#/produto45resource


Acesso para lista de repositorios: https://dashboard.heroku.com/apps/sigo-back-gestao/api/repositorio

Acesso repositorio unico: https://dashboard.heroku.com/apps/sigo-back-gestao/repositorio/{id}

Salvar, Atualizar e Deletar repositorio: https://dashboard.heroku.com/apps/sigo-back-gestao/repositorio

Acesso para lista de repositorios: https://dashboard.heroku.com/apps/sigo-back-gestao/api/norma

Acesso repositorio unico: https://dashboard.heroku.com/apps/sigo-back-gestao/norma/{id}

Salvar, Atualizar e Deletar repositorio: https://dashboard.heroku.com/apps/sigo-back-gestao/norma

Recompilar node_modules
rm -rf node_modules package-lock.json && npm install

Rodar teste
mvn test

Gerar build 
mvn spring-boot:run
#sudo service postgresql stop
#sudo docker-compose down

Subir .jar java
java -Dserver.port=5050 -jar target/pucsigo-0.0.1-SNAPSHOT.jar

Docker subir aplicacao 
sudo docker-compose up --build --force-recreate


#mvn dependency:tree -Dverbose
#sudo createdb -h localhost -p 5432 -U postgres processo_api
#sudo service postgresql 