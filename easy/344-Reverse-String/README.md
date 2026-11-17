# LeetCode 344 - Reverse String

## Problem
Write a function that reverses a string.

The input string is given as a character array.

## Approach
Used the Two Pointer technique.

1. Initialize left pointer at index 0.
2. Initialize right pointer at the last index.
3. Swap both characters using a temporary variable.
4. Move left forward and right backward.
5. Repeat until both pointers meet.

## Example

Input: ["h","e","l","l","o"]

Output: ["o","l","l","e","h"]

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)