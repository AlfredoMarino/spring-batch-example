DROP TABLE person IF EXISTS;

CREATE TABLE person(
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    phone VARCHAR(10)
);