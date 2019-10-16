'''
data.dat
3 100
-8 56 
33 0 
'''

# The first time it reads the all data file
print("First time")
f = open("data.dat", "r")
print(f.read()) # Read the data file
f.close()

# The second time it reads the first 15 characters
print ("Second Time")
f = open("data.dat", "r")
print(f.read(15)) #read the first 15 characters
f.close()

print("Third Time")
f = open("data.dat", "r")
print(f.readline(), end="")
print(f.readline(), end ="")
print(f.readline())

print(f.readlines())
f.close()
