DROP TABLE IF EXISTS accounts;

CREATE TABLE billionaires (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL
);

INSERT INTO billionaires (username, password) VALUES
('username1', 'password1'),
('username2', 'password2'),
('username3', 'password3');
