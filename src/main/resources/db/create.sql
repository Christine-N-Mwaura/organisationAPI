SET MODE PostgreSQL;


CREATE TABLE IF NOT EXISTS departments(
 id int PRIMARY KEY auto_increment,
 description VARCHAR,
 deptname VARCHAR,
 empnumber INTEGER
);

CREATE TABLE IF NOT EXISTS news(
id int PRIMARY KEY auto_increment,
writtenby VARCHAR,
newscontent VARCHAR,
deptid INTEGER
);

CREATE TABLE IF NOT EXISTS users(
id int PRIMARY KEY auto_increment,
name VARCHAR,
position VARCHAR,
deptid INTEGER,
roles VARCHAR,

);