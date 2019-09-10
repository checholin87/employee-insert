create table employee
(
    uuid varchar(36) not null,
    name varchar(50) not null,
    constraint employee_pk
        primary key (uuid)
)
comment 'employees of the bank';