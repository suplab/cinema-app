--create database
CREATE DATABASE IF NOT EXISTS moviesdb;
-- grant all privileges to root
grant all privileges on *.* to 'root'@'localhost';
flush privileges;
-- allow all hosts to connect
update user set host='%' where user='root';
commit;
flush privileges;