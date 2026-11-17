# LeetCode 1603 - Design Parking System

## Problem
Design a parking system for three types of parking spaces:
- Big (Type 1)
- Medium (Type 2)
- Small (Type 3)

Implement two operations:
1. ParkingSystem(): Initializes the parking system with the available spaces.
2. addCar(): Checks whether a car can be parked.

Return true if the car can be parked; otherwise, return false.

## Approach
Used a class with three variables to store available parking spaces.

1. Initialize big, medium and small parking spaces using the constructor.
2. Check the car type in addCar().
3. If a parking space is available, decrease its count by one.
4. Return true if parked successfully.
5. Otherwise, return false.

## Complexity
Time Complexity: O(1) per operation  
Space Complexity: O(1)