create database vehiclemanagementsystem;
show databases;
use vehiclemanagementsystem;

create table account(username varchar(20), name varchar(20),password varchar(20),security varchar(100), answer varchar(50));
show tables;
select * from account;
show tables;
use vehiclemanagementsystem;
select * from account;
create table ownerDetails(username varchar(20), id varchar(30), number varchar(30), name varchar(30), gender varchar(20) , state varchar(30) , address varchar(100) , phone int(15) , email varchar (50));
select * from ownerDetails;
create table carDetails(make varchar(50), model varchar(50), year varchar(20), registration_no varchar(30));
select * from carDetails;
drop table carDetails;
show tables;
create table vehicleDetails(make varchar(30), model varchar(30),year int(10),registration_no varchar(30));
select * from vehicleDetails;
drop table vehicleDetails;
alter table vehicleDetails add owner varchar(30);
DELETE FROM vehicleDetails WHERE make = 'Ford';
drop table vehicleDetails;
show tables;
create table vehicleDetails(owner varchar(30),make varchar(30), model varchar(30),year int(10),registration_no varchar(30));
select * from vehicleDetails;
drop table vehicleDetails;
drop table ownerDetails;
delete from vehicleDetails where owner='Sejal';
create table vehicleDetails(owner varchar(30),make varchar(30), model varchar(30),year int(10),registration_no varchar(30));
select * from vehicleDetails;	
select * from account;
drop table account;
use vehicleManagementSystem;
create table ownerDetails(username varchar(20), id varchar(30), number varchar(30), name varchar(30), gender varchar(20) , state varchar(30) , address varchar(100) , phone varchar(50) , email varchar (50));
select * from ownerDetails;
drop table account;
create table vehicleDetails(username varchar(30),make varchar(30), model varchar(30),year int(10),registration_no varchar(30));
use vehiclemanagementsystem; 			
create table account(username varchar(20), name varchar(20),password varchar(20),security varchar(100), answer varchar(50));
select * from account;
select * from vehicleDetails;
select * from ownerDetails;
delete from vehicleDetails where username='tanvi';

