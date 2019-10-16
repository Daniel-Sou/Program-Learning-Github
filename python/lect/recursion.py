'''
Define a function reverse_list that takes a list as an argument and returns None, but reverses the elements in the list as a side effect. Do not use any built-in list methods (especially not reverse), but assignment statements are fine.
'''

L = list(range(1,20,2))

print(L)

def RecReverseList(L,Start):
  if Start < (len(L) // 2):
    L[Start], L[-Start-1] =  L[-Start-1], L[Start]
    RecReverseList(L,Start + 1) 


def build_in_reverse(L):
  L[:] = L[::-1]

RecReverseList(L,0)

print(L) # After recursion

new_L = L # Replace the new list

build_in_reverse(new_L)

print(new_L)

print(L)