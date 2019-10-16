'''
2. In the following code, there are 3 loops. Rewrite the code using only one loop.

while (i<len(P) and j<len(Q)):
   if (P[i][1]>Q[j][1]):
      R.append([P[i][0],P[i][1]])
      i=i+1
   elif (P[i][1]==Q[j][1]):
        R.append([P[i][0]+Q[j][0],P[i][1]])
        i=i+1
        j=j+1
   else:
      R.append([Q[j][0],Q[j][1]])
      j=j+1

while (i<len(P)):
      R.append([P[i][0],P[i][1]])
      i=i+1

while (j<len(Q)):
      R.append([Q[j][0],Q[j][1]])
      j=j+1
'''

while (i<len(P) or j<len(Q)):
   if (P[i][1]>Q[j][1]):
      R.append([P[i][0],P[i][1]])
      i=i+1
   elif (P[i][1]==Q[j][1]):
        R.append([P[i][0]+Q[j][0],P[i][1]])
        i=i+1
        j=j+1
   else:
      R.append([Q[j][0],Q[j][1]])
      j=j+1