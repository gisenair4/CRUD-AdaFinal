# CRUD-AdaFinal
Trabajo final de ADA: creación de una aplicación/servicio REST que permita gestionar becas y cupos de estudio de cursos, en diferentes categorías.
En proceso de construcción  :computer:


## Creado con 🗄️  

* [Eclipse](https://www.eclipse.org/downloads/)- IDE
* [MySQL](https://www.mysql.com/products/workbench/)- Database  
* [Maven](https://maven.apache.org/)-  dependencies manager
* [Junit](https://junit.org/junit4/)-  unitary testing
* [SpringBoot](https://spring.io/projects/spring-boot)- framework
* [Swager](https://swagger.io/)- documentation
* [Spring Security](https://spring.io/projects/spring-security)- 


### Descripción del trabajo final

Los cursos son publicados por una app de empresas que deben estar registradas en el sistema de base de datos y deberán ser aprobadas por un administrador.  Mientras la empresas no tenga dicha aprobación, no podrá cargar los cursos que ofrece. 
Los datos de la empresa en el sitema son: 

*Nombre dela empresa * Cuil  * Tipo de empresa * Categoría de la empresa * Año de creación * Búmero de contacto * Representante : Nombre y apellido, Tipo  y número de documento, cargo en la empresa, email.

Los cursos de cada empresa solo podrán ser cargados por los representantes inscriptos en la plataforma y acceso a la misma.  Cada curso tienen una capacidad máxima de alumnos, pasada esa capacidad no se puede inscribir  más laumnos. 
Las inscripciones  pueden  tener beca o no.  Las becas a demás pueden ser totales o parciales (50% , 75%, 100%).  Se evalúa la situación de cada aspirantes y  se aprueba o no la beca solicitada.
LAs inscripciones deben considerar los siguientes aspectos: 
* Nombre y Apellido * Fecha de nacimiento * Género * Lugar de vivienda * Estudio Socio-económico: estudia?, trabaja?, tiene ingresos? cantidad mensual?, familia a cargo? cuántos?

El administrador tiene la responsabilidad de indicar si un alumno ha fializado u n curso o sigue  en progreso.
El motor de búsqueda de cursos debe contemplar los siguientes criterios: 
*Todos los cursos disponibles  (con cupos abiertos) * Todos los cursos por categoría * Todos los cursos por empresas *  Todos los cursos por participante en progreso *  Todos los cursos por participantes finalizados * Todos los cursos por empresa y categoría

### REquerimientos
El sistema debe cumplir con todas las funcionalidades descitas anteriormente.
El manejo de los roles es a través de JWT y USER_ROLE. 
Se le agrega Api Rest Documentation (Swagger) y Unit e Integrationts test
