# LeetCode 709 - To Lower Case

## Problem
Given a string s, convert all uppercase letters into lowercase letters and return the resulting string.

## Approach
Used character manipulation.

1. Create a StringBuilder to store the result.
2. Traverse the string using a for loop.
3. Get each character using charAt().
4. Check whether the character is between 'A' and 'Z'.
5. If uppercase, add 32 to its ASCII value.
6. Append the character to StringBuilder.
7. Return the final string.

## Example

Input: "Hello"

Output: "hello"

## Complexity
Time Complexity: O(n)

Space Complexity: O(n)