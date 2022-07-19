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

select * from requests;

insert into requests values(default, 'porkbellies', 'because i want money', 7, 'Pending', 'sounds good to me', 'dodgeball');

alter table requests
	add constraint amount check (amount < 1000);