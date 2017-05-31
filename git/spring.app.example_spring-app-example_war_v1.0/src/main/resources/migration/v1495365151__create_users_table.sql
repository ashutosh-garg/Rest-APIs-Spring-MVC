create database testdb;

create table users (
  
  id bigserial primary key,
  name varchar(100) not null,
  uniqueId varchar(100) not null unique,
  email    varchar(100) unique

);

insert into users (id, name, uniqueId, email) 
values (0, 'Bot', '000000', 'bot@example.com');