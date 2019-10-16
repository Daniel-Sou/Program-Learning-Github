file = open("testfile.txt",'w')

file.write("Hello World \n")
file.write("This is our new text file !!! \n")
file.write("and this is another line.\n")
file.write("Why? Because we can.\n")

file.close()

file = open("testfile.txt",'r')

print(file.read(5))

for line in file:
  print(line)