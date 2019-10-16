# Program to find the sum of all numbers stored in a list

# List of numbers
numbers = [6, 5, 3, 8, 3, 2, 5, 4, 11]

# variable to store the sum
sum = 0

# iterate over the list
for val in numbers:
	sum = sum+val

# Output: The sum is 48
print("The sum is", sum, "\n")

# Range
print(range(5))
print(list(range(10)),"\n")

# Program to iterate through a list using indexing

genre = ['pop', 'rock', 'jazz']

# len() a sequence using indexing
print(len(genre))
print(range(len(genre)))

# iterate over the list using index
for i in range(len(genre)):
	print("I like", genre[i])
