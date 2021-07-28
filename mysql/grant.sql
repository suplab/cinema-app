grant all privileges on *.* to 'root'@'localhost';
flush privileges;
update user set host='%' where user='root';
flush privileges;