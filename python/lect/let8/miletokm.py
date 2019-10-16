#!/usr/bin/env python3
 
# Converts distance in miles to kilometers.

# conversion value
KMS_PER_MILE = 1.609
 
# Get the distance in miles
miles = float(input("Enter the distance in miles: "))
 
# Convert the distance to kilometers
kms = KMS_PER_MILE * miles
 
# Display the distance in kilometers
print(miles, "miles equals", kms, "kilometers.")
 
