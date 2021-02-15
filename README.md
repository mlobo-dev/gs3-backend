# gs3-backend
Desafio GS3

# Run & Install

## Live Sample
   Disponivel atraves do link http://ec2-13-58-102-164.us-east-2.compute.amazonaws.com:8080/swagger-ui.html

## Local Host
Recomendo alterar o profile do ambiente para <b>test</b>, afim de subir o aplicação como banco de dados H2
ou <b>dev</b> para subir em seu banco local postgres

    mvn clean install 
    mvn spring-boot:run
    
obs.: Não se esquece de alterar profile :)    


# Docker
     docker-compose up    
    

## Usuarios de teste
* Administrador
    * login: admin
    * senha:123456
    * role: Administrador

* Usuário Comun
    * login:user
    * senha:123456
    * role: Comun