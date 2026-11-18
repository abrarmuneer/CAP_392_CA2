# LeetCode 1470 - Shuffle the Array

## Problem
Given an array in the format [x1, x2, ..., xn, y1, y2, ..., yn], rearrange it into [x1, y1, x2, y2, ..., xn, yn].

## Approach
Used an additional array.

1. Create a new array of size 2 * n.
2. Traverse the original array using a for loop.
3. Place nums[i] at index 2 * i.
4. Place nums[i + n] at index 2 * i + 1.
5. Return the new array.

## Example

Input:
nums = [2, 5, 1, 3, 4, 7]
n = 3

Output:
[2, 3, 5, 4, 1, 7]

## Complexity
Time Complexity: O(n)

Space Complexity: O(n)