'1, Write a function that reverses a list. Do this using recursion.'

num = [1,2,3,4,5]

L = list(range(1,20,2))

print(num)
print(L)

def RecReverseList(L,Start):
  if Start < (len(L) // 2):
    L[Start], L[-Start-1] =  L[-Start-1], L[Start]
    RecReverseList(L,Start + 1) 

RecReverseList(L,0)
print(L)

RecReverseList(num,0)
print(num)

'''
Printed Result:
[1, 2, 3, 4, 5]
[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
[19, 17, 15, 13, 11, 9, 7, 5, 3, 1]
[5, 4, 3, 2, 1]
'''