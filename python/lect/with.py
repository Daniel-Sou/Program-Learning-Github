'''
With Statement

Any files opened will be closed automatically after you are done

testfile.txt
Hello World 
This is our new text file !!! 
and this is another line.
Why? Because we can.
'''
with open("testfile.txt") as file:
  data = file.readlines()
  print(data)

with open("testfile.txt","r") as file :
  data = file.readlines()

  for line in data :
    words = line.split()
    print(words)