drop table if exists requests;

CREATE TABLE requests (
	id serial PRIMARY KEY, 
	requester_username varchar references employees(username), 
	request_reason varchar(500) not null, 
	amount integer, 
	request_status varchar(10),
	status_reason varchar(500) not null,
	manager_username varchar references employees(username)
);

alter table requests
	add constraint amount check (amount < 1000);

insert into requests values(default, 'Requester1', 'because i want money', 7, 'Pending', '...', 'Manager1');
insert into requests values(default, 'Requester2', 'i spent a lot', 8, 'Pending', '...', 'Manager1');
insert into requests values(default, 'Requester2', 'i like money', 9, 'Pending', '...', 'Manager2');
insert into requests values(default, 'Requester3', 'money is funny', 999, 'Pending', '...', 'Manager2');

select * from requests;