# LeetCode 125 - Valid Palindrome

## Problem
Given a string, determine whether it is a palindrome after converting uppercase letters into lowercase and removing all non-alphanumeric characters.

## Approach
Used the Two Pointer technique.

1. Convert the string into lowercase.
2. Initialize left pointer at the beginning.
3. Initialize right pointer at the end.
4. Skip spaces and special characters.
5. Compare characters from both ends.
6. If characters are different, return false.
7. If all characters match, return true.

## Example 1

Input: "A man, a plan, a canal: Panama"

Output: true

## Example 2

Input: "race a car"

Output: false

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1) auxiliary space, excluding lowercase conversion.