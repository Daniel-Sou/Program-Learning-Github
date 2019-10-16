# This is the list of polynomimal
P = [3,100], [-25,56], [33,0]
Q = [12,93], [19,56], [28,33], [86,20], [22,5]
R = []

# Print the 
print(P[0][0], "x ^", P[0][1], "+", P[1][0], "x ^", P[1][1], "+", P[2][0], "x ^", P[2][1])
print(Q[0][0], "x ^", Q[0][1], "+", Q[1][0], "x ^", Q[1][1], "+", Q[2][0], "x ^", Q[2][1], "+" ,Q[3][0], "x ^", Q[3][1], "+" , Q[4][0], "x ^", Q[4][1])

print("")

i = 0
j = 0

while (i<3):
  print(P[i][0], "x ^", P[i][1], "+", end = " ")
  i = i + 1

i = 0

print("")

while ( i<3 and j<5):
  if (P[i][1] > Q[j][1]):
    R.append([P[i][0], P[i][1]])
    i = i + 1
  elif ( P[i][1] == Q[j][1]):
    R.append([P[i][0] + Q[j][0], P[i][1]])
    i = i + 1
    j = j + 1
  else:
    R.append([Q[j][0], Q[j][1]])
    j = j + 1

print(R)