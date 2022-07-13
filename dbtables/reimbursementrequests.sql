CREATE TABLE requests (
	id serial PRIMARY KEY, 
	-- requester_name from employees table
	request_reason varchar(500), 
	amount int, 
	request_status,
	status_reason,
	-- manager_name from employees table
);
