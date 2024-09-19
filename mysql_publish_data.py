import mysql.connector
import json

# Connect to MySQL database
connection = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root",
    database="json_test"
)

cursor = connection.cursor()
# Load JSON data from file
with open('large_data.json') as file:
    data = json.load(file)

# Insert JSON data into MySQL table
for record in data:
    # Convert record to JSON string
    json_string = json.dumps(record)
    
    # Use parameterized query
    cursor.execute(
        "INSERT INTO `json_table` (value) VALUES (CAST(%s AS JSON))",
        (json_string,)
    )

connection.commit()
cursor.close()
connection.close()
