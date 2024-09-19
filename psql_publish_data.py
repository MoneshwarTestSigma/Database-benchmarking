import psycopg2
import json

# Connect to PostgreSQL database
connection = psycopg2.connect(
   host="localhost",
    user="root",
    password="root",
    database="json_test"
)

cursor = connection.cursor()

# Load JSON data from file
with open('large_data.json') as file:
    data = json.load(file)

# Insert JSON data into table
for record in data:
    json_string = json.dumps(record)
    cursor.execute(
        "INSERT INTO json_table (value) VALUES (%s)",
        (json_string,)
    )

connection.commit()
cursor.close()
connection.close()

