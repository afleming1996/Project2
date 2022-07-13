--drop table if exists employees;

CREATE TABLE employees(
	id serial, 
	employee_name varchar(50), 
	username varchar(20) primary key, 
	employee_role varchar(10)
);

insert into employees values(default, 'St. John Smythe', 'shakennotstirred', 'Manager');
insert into employees values(default, 'Peter Venkman', 'themagicword', 'Requester');
insert into employees values(default, 'Marcus Auraleus', 'themeditationking', 'Requester');
insert into employees values(default, 'William Riker', 'maneuver', 'Requester');
insert into employees values(default, 'Cotton McKnight', 'dodgeball', 'Manager');
insert into employees values(default, 'Clarance Beeks', 'porkbellies', 'Requester');

select * from employees;