# Database-benchmarking

## MYSQL:
CREATE TABLE \`json_table\` (
    id INT AUTO_INCREMENT PRIMARY KEY,
    value JSON
);

## PSQL:
CREATE TABLE json_table (
    id SERIAL PRIMARY KEY,
    value JSONB
);

## PYTHON:

pip3 install mysql-connector-python

pip3 install psycopg2-binary

