# LeetCode 1 - Two Sum

## Problem
Given an array of integers nums and an integer target, return the indices of two numbers whose sum equals the target.

## Approach
Used HashMap.

1. Create a HashMap to store numbers and their indices.
2. Traverse the array.
3. Calculate complement = target - nums[i].
4. Check whether the complement exists in the HashMap.
5. If found, return both indices.
6. Otherwise, store the current number and its index.
7. Return an empty array if no pair is found.

## Example

Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

## Complexity
Time Complexity: O(n) average

Space Complexity: O(n)