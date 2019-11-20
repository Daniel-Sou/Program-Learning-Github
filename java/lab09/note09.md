# LAB 9 Queue and List Abstraction

## Objectives
- Get familiar with abstract Queue
- Get familiar with Growable Array-based Array List
- Get familiar with Positional List

## Note from Telusko
Stack implementation in Java without using Collection.

In this video we will see practical implementation of Stack using Dynamic Array in Java

We will see  :
- Stack Operations on Dynamic array :
  - Push
  - Pop
  - Size
  - isFull
  - expand
  - shrink

Stack : It is Last-In-First-Out (LIFO) DS

The name "stack" for this type of structure comes from the analogy to a set of physical items stacked on top of each other, which makes it easy to take an item off the top of the stack, while getting to an item deeper in the stack may require taking off multiple other items first

We can perform 2 operation on it :
PUSH : which adds an element to the collection, and
POP : which removes the most recently added element that was not yet removed

## Practice:
What values are returned during the following sequence of queue operations, if executed on an initially empty queue? enqueue(5), enqueue(3), dequeue(), enqueue(2), enqueue(8), dequeue(), dequeue(), enqueue(9), enqueue(1), dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(), enqueue(4), dequeue(), dequeue().

Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).

## Exercise: 
Parentheses matching

Reimplement the ArrayStack class using dynamic arrays to support unlimited capacity.

```
[ ] -> [ ] ->  [ ]
```

If implement the dynamic ArrayStack,
use `expand()`, `shrink()`

---
[Submission Guideline] 

Please submit .java file to UMMoodle.
Do not copy your classmate’s codes, otherwise both of you will lose scores.
Submission deadline: 11:50 p.m., 20/11/2019. (It will be better if you can submit
at the end of this lab.)

