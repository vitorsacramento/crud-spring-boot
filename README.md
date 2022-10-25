# Springboot API 
CRUD em uma simples API em Springboot

## Funcionamento
Ao executar o projeto, a tabela "pessoas" será criada e alguns registros serão adicionados. É possível listar, incluir, editar e excluir registros.

## Database
H2 Database

## Configurações
### Properties:
Atualmente o **_application.properties_** está apontando para o H2 Database, porém, já está incluso as properties para o MySQL e também as dependências. Para usá-lo, descomente as properties e troque o nome da database:
- #spring.datasource.url=jdbc:mysql://localhost:3306/**nome-da-database**?createDatabaseIfNotExist=true&serverTimezone=UTC

### Flyway Migration:
O projeto consta com alguns registros iniciais que são inseridos com ajuda do Flyway Migrations. Os arquivos ficam em seu diretório padrão:
__src/main/resources > db > migration__

Dentro do diretório, existem dois arquivos: 
* V001__cria-tabela-pessoa.sql;
* V002__cria-registros-tabela-pessoa.sql.

Com esses arquivos é possível criar a tabela pessoas e inserir registros nela, respectivamente.

## Executando
1 - Clone o projeto;

2 - Adicione o projeto à sua IDE indo até File > Import > Existing Maven Projects;

3 - Aguarde o Maven atualizar as dependências necessárias para execução do projeto;

4 - Execute o projeto 

## Fazendo as requisições
Após ter o projeto todo em funcionamento e em execução, faça as requisições com o Postman para os endpoints disponíveis. Como se trata de um CRUD, o projeto conta com os seguintes endpoints:
- ### **listar**  
  Lista todos os registros do recurso.
  
   #### Exemplo de requisição
   localhost:8080/pessoas
  
- ### **obter**  
  Obtém os dados do recurso por um determinado ID.
  
   #### Exemplo de requisição
   localhost:8080/pessoas/1

- ### **adicionar**  
  Adiciona um novo registro ao recurso.
  
   #### Exemplo de requisição
   localhost:8080/pessoas
  
- ### **atualizar** 
  Atualiza os dados do recurso.
  
   #### Exemplo de requisição/1
   localhost:8080/pessoas
  
- ### **excluir** 
  Exclui o registro de um recurso baseado num determinado ID.
  
   #### Exemplo de requisição
   localhost:8080/pessoas
   
## Bibliotecas
- Spring Web;

- Spring DevTools;

- Spring Data JPA;

- H2 Database;

- MySQL Driver;

- Flyway Migration;

- Lombok.


