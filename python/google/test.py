print('This is testing of Python Code')

num = [1,2,3]
sum = 0

# For loop
for i in num:
    print(i, end=' & The sum is ')
    sum += i
    print(sum, end='\n')

print()

# Print the numbers from 0 through 99
for i in range(100):
    print(i, end=' - ')

print()

for i in range(3):
    for j in range(4):
        print("*", end=' ')
    print()

print()

k = 0
a = [2,4,5,6]
while k < len(a):
    print(a[k])
    k += 1

print()

name = ['Daniel','Larry',"Abby",'shes','NamN']

name.append('Coco')
print(name.index('Daniel')+1)
print('The first character is ',name[0][0],'and the last character is ', name[0][-1],sep=' -- ',end='\n\n')

count = 0
print('The Dancing team include ',end='')
for i in name:
    if (i == name[-1]):
        print(i,end='\n')
        count += 1
    else:
        print(i,end=', ')

print(count)

same = 0
for i in name:
    for j in name[i]:
        for k in name[i]:
            if (j == k):
                same += 1

print(same)