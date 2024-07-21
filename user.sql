create database login;
use login;
-- auto-generated definition
create table tb_user
(
    phone    varchar(128) not null
        primary key,
    password varchar(128) null
);

