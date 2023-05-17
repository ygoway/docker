CREATE DATABASE IF NOT EXISTS info_db;

CREATE TABLE IF NOT EXISTS info (
  id NUMERIC PRIMARY KEY,
  title VARCHAR(200) NOT NULL
  text TEXT NOT NULL
);

INSERT INTO info (id, title, text)
VALUES
(1, 'Data1', 'Data2'),
(2, 'data2', 'data2');