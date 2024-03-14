CREATE TABLE person
(
    pid         BIGINT PRIMARY KEY,
    first_name  VARCHAR(255) not null,
    middle_name VARCHAR(255),
    last_name   VARCHAR(255) not null,
    email       VARCHAR(255),
    phone       VARCHAR(20)
);
INSERT INTO person (pid, first_name, middle_name, last_name, email, phone)
values (11111111, 'John', 'Doe', 'Smith', 'john.doe@example.com', '123-456-7890');
