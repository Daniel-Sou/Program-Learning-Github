'''
data.dat
3 100
-8 56 
33 0 
'''

poly=[]
infile=open("data.dat", "r")

print(infile.readline())

for x in infile:
  c,p=x.split()
  print(c+"x^"+p)
  c=int(c)
  p=int(p)
  poly.append([c,p])

print(poly)

infile.close()
