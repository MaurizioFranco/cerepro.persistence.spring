drop database IF EXISTS  cerepro_dev;
create database cerepro_dev;
CREATE USER 'cerepro_dev'@'%' IDENTIFIED BY 'cerepro_dev';
GRANT ALL PRIVILEGES ON cerepro_dev.* TO 'cerepro_dev'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

drop database IF EXISTS  cerepro_test;
create database cerepro_test;
CREATE USER 'cerepro_test'@'%' IDENTIFIED BY 'cerepro_test';
GRANT ALL PRIVILEGES ON cerepro_test.* TO 'cerepro_test'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;


