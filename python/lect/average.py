#!/usr/bin/python

stu_num = range((input("Please input the student number > "))

print("The student number is", stu_num)

stu_mark = []

for i in stu_num:
  stu_mark.append(input("The student mark %d is > " % (i+1)))

for j in stu_mark:
    print("The student",stu_num,"mark is ",j)

