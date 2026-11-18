# LeetCode 35 - Search Insert Position

## Problem
Given a sorted array and a target value, return the index if the target is found. Otherwise, return the index where it should be inserted to maintain sorted order.

## Approach
Used Binary Search.

1. Initialize left = 0.
2. Initialize right = nums.length - 1.
3. Calculate the middle index.
4. If the middle element equals the target, return its index.
5. If the middle element is smaller, search the right half.
6. Otherwise, search the left half.
7. If the target is not found, return left.

## Example

Input:
nums = [1, 3, 5, 6]
target = 2

Output:
1

## Complexity
Time Complexity: O(log n)

Space Complexity: O(1)