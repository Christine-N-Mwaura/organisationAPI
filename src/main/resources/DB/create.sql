SET MODE PostgreSQL;


CREATE TABLE IF NOT EXISTS departments(
 id int PRIMARY KEY auto_increment,
 description VARCHAR,
 deptname VARCHAR,
 empnumber INTEGERsrc/test/java/models/UsersTest.java
);

CREATE TABLE IF NOT EXISTS news(
id int PRIMARY KEY auto_increment,
writtenby VARCHAR,
newscontent VARCHAR
);

CREATE TABLE IF NOT EXISTS users(
id int PRIMARY KEY auto_increment,
name VARCHAR,
position VARCHAR,
deptid INTEGER,
roles VARCHAR,

);