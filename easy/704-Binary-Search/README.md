# LeetCode 704 - Binary Search

## Problem
Given a sorted array of integers and a target value,
return the index of the target if it exists.
Otherwise, return -1.

## Approach
Used Binary Search.

1. Initialize left = 0.
2. Initialize right = nums.length - 1.
3. Calculate the middle index.
4. If the middle element equals the target, return its index.
5. If the middle element is smaller, search the right half.
6. Otherwise, search the left half.
7. Return -1 if the target is not found.

## Example

Input:
nums = [-1,0,3,5,9,12]
target = 9

Output:
4

## Complexity
Time Complexity: O(log n)
Space Complexity: O(1)