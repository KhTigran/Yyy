create database if not exists dem;
use dem;

create table if not exists som (
id integer primary key auto_increment,
cost integer not null,
discription varchar(40) not null);

create table if not exists usr (
login varchar(40) primary key,
pass varchar(40) not null);

insert into som(id,cost,discription) values (Null, 123,'hfhfhfh');
insert into usr(login,pass) values ('user','1111');
insert into usr(login,pass) values ('user2','0000');
select * from som