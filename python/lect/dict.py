# Dictionaries created
prime = dict(zip(range(6), [2, 3, 5, 7, 11, 13]))

print(prime)
print(prime.keys())


'''
Dictionary operations:
d.keys(): return a list of keys in dictionary d

d.values(): return a list of values in dictionary d

d.pop(key[, default]): remove and return the value of the given key from dictionary d if the key exists, or default if the key does not exist

d.popitem(): remove and return an arbitrary item (key, value pair) from dictionary d

d1.update(d2): update dictionary d1 with the contents of dictionary d2; adds all contents of d2 to d1; if keys in d2 match existing keys in d1, overwrite the corresponding values in d1 with those from d2
'''
