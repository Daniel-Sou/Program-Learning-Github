# Write python program to do matrix manipulation with List

# Function with multiply
def multiply(A,B,result):
  # iterate through rows of A
  for i in range(len(A)):
    # iterate through columns of B
    for j in range(len(B[0])):
      # iterate through rows of B
      for k in range(len(B)):
        result[i][j] += A[i][k] * B[k][j]

  print("The result of matrix multiply is ",result,"\n")

# Function with add
def add(A,B,result):
    for i in range(len(A)):
        for j in range(len(B[0])):
            result[i][j] = A[i][j] + B[i][j]
    
    print("The result of matrix add is ", result, "\n")

# Function with minus
def minus(A,B,result):
    for i in range(len(A)):
        for j in range(len(B[0])):
            result[i][j] = A[i][j] - B[i][j]
    
    print("The result of matrix minus is ", result,"\n")

# A matrix: 2x2 matrix
A = [
    [1,2],
    [4,5]
]

# B matrix: 2x2 matrix
B = [
  [1,2],
  [2,3]
]

# result matrix
result = [
  [0,0],
  [0,0]
]

# Execult the code
print("The first matrix is ", A)
print("The second matrix is ", B, "\n")

multiply(A,B,result)
add(A,B,result)
minus(A,B,result)
