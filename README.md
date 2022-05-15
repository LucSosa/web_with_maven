# CRUD Despesas JDBC com Visualização Web
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=COURSE&message=CLOSE&color=RED&style=for-the-badge)

Hi! I'm Lucas Sosa. This project is a study about CRUD during this course I used Java and Postgress, the study ocurred in period between May 11th and May 15th.

# Files

In this project I used the archtetury MVC.
 - Import the project crud-depespesas-jdbc: To use the CRUD
 - To execute add expenditures is necessary execute adiciona-despesa.html
 - To execute remove expenditures is necessary execute removeDespesas

# Software Used

For this project, i used:

 - PG Admin
 - Intellij IDEA Community
 - Jetty

> **Used Database:** 

 - To create the database you must type:
	 - create table despesas (
		id bigserial primary key,
		descricao varchar(100),
		data date,
		valor decimal (10, 2),
		categoria varchar(60)
);

# Lessons learned from this project

### WebServlet

**Um servlet pode ser definido utilizando a anotação @WebServlet em uma classe POJO**, além disso devemos também estender a classe javax.servlet.http.HttpServlet.

https://www.devmedia.com.br/java-servlets-introduzindo-o-webservlet/30247
