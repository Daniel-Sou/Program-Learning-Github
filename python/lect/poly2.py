'Dictionary'
P = [{'CO':3, 'EXP':100},{'CO':-25, 'EXP':56},{'CO':33, 'EXP':8}]
Q = [{'CO':12, 'EXP':93},{'CO':19, 'EXP':56},{'CO':26, 'EXP':39},{'CO':22, 'EXP':8}]

Q.append({'CO':10, 'EXP':5})

for term in Q:
  print(term)

print(Q[0]['CO'])

R = []

print(P[0]['CO'],'x ^', P[0]['EXP'], P[1]['CO'],'x ^', P[1]['EXP'],' + ',P[2]['CO'],'x ^', P[2]['EXP'])

# Print Poly
i = 0
j = 0
def PrintPoly(Poly):
  for Term in Poly:
    print(Term['CO'], 'x ^', Term['EXP'], ' ', end='')
  print()

PrintPoly(Q)

