import csv

f = open('data/population.csv')
data = csv.reader(f)
data = list(data)
count = 0

for row in data :
    print(row)
    count = count+1
		
    if(count>=3) :
        break