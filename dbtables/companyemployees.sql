drop table if exists employees;

CREATE TABLE employees(
	id serial, 
	employee_name varchar(50), 
	employee_role varchar(10),
	username varchar(20) primary key, 
	user_password varchar(50)
);

alter table employees
add constraint employee_role check (employee_role in ('Requester', 'Manager'));

insert into employees values(default, 'St. John Smythe', 'Manager', 'Manager1', 'password');
insert into employees values(default, 'Peter Venkman', 'Manager', 'Manager2', 'password');
insert into employees values(default, 'Marcus Auralius', 'Requester', 'Requester1', 'password');
insert into employees values(default, 'William Riker', 'Requester', 'Requester2', 'password');
insert into employees values(default, 'Cotton McKnight', 'Requester', 'Requester3', 'password');

select * from employees;



