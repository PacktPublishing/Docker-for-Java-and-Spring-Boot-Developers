use creditdb;

CREATE TABLE credit_score (
    ssn varchar(10) NOT NULL,
    last_name varchar(255) NOT NULL,
    first_name varchar(255) NOT NULL,
    score int,
    PRIMARY KEY (ssn)
);

CREATE TABLE credit_card (
    ssn varchar(10) NOT NULL,
    last_name varchar(255) NOT NULL,
    first_name varchar(255) NOT NULL,
    card_number varchar(16) NOT NULL,
    expiry_date date,
    sec_code int,
    PRIMARY KEY (ssn)
);

insert into credit_score  values('1234567890', 'ferguson', 'john', 700);
insert into credit_score  values('1234567891', 'bailey', 'doug', 900);
insert into credit_score  values('1234567892', 'thippireddy', 'Bharath', 600);
insert into credit_score  values('1234567893', 'baber', 'ahmed', 800);
