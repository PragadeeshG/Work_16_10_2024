create table if not exists business_line_of_credit_category(
line_of_credit_code varchar(255) not null,
line_of_credit_name varchar(255) null,
line_of_credit_description varchar(255) null,
line_of_credit_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint business_line_of_credit_category_pk primary key(line_of_credit_code));