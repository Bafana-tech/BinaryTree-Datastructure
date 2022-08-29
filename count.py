
import os
file = open("../data/oklist.txt", "r")
ids = list()

#separated = file.split()
for line in file.readlines():
    ids.append(line[:9])
os.system(system.out.print("Hello"));
print(ids)