# LeetCode 912 - Sort an Array

## Problem
Given an integer array nums, sort the array in ascending order and return it.

The solution should not use built-in sorting functions.

## Approach
Used Merge Sort.

1. Divide the array into two halves.
2. Recursively divide each half until individual elements remain.
3. Merge the smaller arrays in sorted order.
4. Copy the merged elements back into the original array.
5. Return the sorted array.

## Example

Input:
nums = [5, 2, 3, 1]

Output:
[1, 2, 3, 5]

## Complexity
Time Complexity: O(n log n)

Space Complexity: O(n)