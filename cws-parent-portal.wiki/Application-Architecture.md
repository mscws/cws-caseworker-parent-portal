This prototype is based on a JavaScript based front end application and Java based backend set of RESTful API. Data is stored within a MySQL relational database. An overview of the major system components is provided in the diagram and summary below:

![Taborda Prototype Application Architecture](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/ADQP-Taborda-ApplicationArchitecture.png)

* Front End Application - Angular.js and HTML5
* Front End Web Framework - Bootstrap
 * Backend Programming Language - Java
* Backend RESTful API - Dropwizard
	* JSON Serialization - Jackson
	* REST API Framework - Spring Data Rest
	* Web Server and Servlet Container - Apache Tomcat
* Object to Relational Mapper - Hibernate ORM
* RDBMS - MySQL Server
* Deployment Platform - Microsoft Windows Server 2008 R2

