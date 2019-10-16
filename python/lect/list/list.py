colors = ['red','blue','green']
print ('The length is ',len(colors))

print('The colors are ', end='')
for i in colors:
  print (i, end=' ')

print("\n")

# Access every 3rd element in a list
for i in range(100):
  print(i , end=" - ")

print("\n")

a = [1,2,3]

i = 0
while i < len(a):
  print(a[i])
  i += 1