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
content VARCHAR,
deptid INTEGER
);

CREATE TABLE IF NOT EXISTS users(
id int PRIMARY KEY auto_increment,
name VARCHAR,
position VARCHAR,
deptid INTEGER,
roles VARCHAR,

);

CREATE TABLE IF NOT EXISTS departments_users(
id int PRIMARY KEY auto_increment,
deptid INTEGER,
userId VARCHAR,

);
