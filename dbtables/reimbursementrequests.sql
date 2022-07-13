drop table if exists requests;

CREATE TABLE requests (
	id serial PRIMARY KEY, 
	requester_username varchar references employees(username), 
	request_reason varchar(500), 
	amount integer, 
	request_status varchar(10),
	status_reason varchar(500),
	manager_username varchar references employees(username)
);

select * from requests;