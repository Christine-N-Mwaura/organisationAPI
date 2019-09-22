SET MODE PostgreSQL;


CREATE TABLE IF NOT EXISTS departments(
 id int PRIMARY KEY auto_increment,
 description VARCHAR,
 deptname VARCHAR,
 empnumber int
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
deptid int,
roles VARCHAR,

);