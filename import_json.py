import json
import random
import string

def generate_random_string(length=10):
    return ''.join(random.choices(string.ascii_letters + string.digits, k=length))

def generate_large_json_data(num_records=1000):
    data = []
    for i in range(num_records):
        record = {}
        for j in range(1, 100):
            record["Parameter"+str(j)] = generate_random_string()
        data.append(record)
    
    with open("large_data.json", "w") as f:
        json.dump(data, f, indent=4)

generate_large_json_data(1000) 
