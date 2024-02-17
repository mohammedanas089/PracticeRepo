-- Create the database
CREATE DATABASE IF NOT EXISTS student;

-- Switch to the created database
USE student;

-- Create the user 'ma1581' with the password '1581'
CREATE USER IF NOT EXISTS 'test'@'%' IDENTIFIED BY 'test';

-- Grant all privileges to the user 'ma1581' on the 'pollapp' database
GRANT ALL PRIVILEGES ON student.* TO 'test'@'%';

-- Flush privileges to apply changes
FLUSH PRIVILEGES;
