create table if not exists business_line_of_credit_sub_category(
line_of_credit_gaurantee_sub_cat_code varchar(255) not null,
line_of_credit_gaurantee_name varchar(255) null,
line_of_credit_gaurantee_description varchar(255) null,
line_of_credit_gaurantee_definition varchar(255) null,
line_of_credit_gaurantee_code_refernce_name varchar(255) null,
error_code bigint null,
error_severity varchar(255) null,
nc_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint business_line_of_credit_sub_category_pk primary key(line_of_credit_gaurantee_sub_cat_code));