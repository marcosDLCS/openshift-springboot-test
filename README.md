# Jpa

Añadimos al proyecto demo soporte para acceso a BBDD mediante jpa con [spring-data](http://projects.spring.io/spring-data/)

Usamos una "in-memory database" como h2.
Podemos acceder a la consola en la ruta /h2-console

Tenemos unos ejemplos de llamadas con postman en src/test/resources/postman

Al arrancar el proyecto se procesa el archivo src/main/resources/data.sql

Podemos ver más ejemplos de uso de spring-data en su [github](https://github.com/spring-projects/spring-data-examples), por ejemplo, named queries, cache, tablas auditadas, etc.
