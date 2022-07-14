drop table if exists employees;

CREATE TABLE employees(
	id serial, 
	employee_name varchar(50), 
	employee_role varchar(10),
	username varchar(20) primary key, 
	user_password varchar(50)
);

insert into employees values(default, 'St. John Smythe', 'Manager', 'shakennotstirred', 'password');
insert into employees values(default, 'Peter Venkman', 'Requester', 'themagicword', 'password');
insert into employees values(default, 'Marcus Auralius', 'Requester', 'themeditationking', 'password');
insert into employees values(default, 'William Riker', 'Requester', 'maneuver', 'password');
insert into employees values(default, 'Cotton McKnight', 'Manager', 'dodgeball', 'password');
insert into employees values(default, 'Clarance Beeks', 'Requester', 'porkbellies', 'password');

select * from employees;