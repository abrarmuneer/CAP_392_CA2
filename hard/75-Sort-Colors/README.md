# LeetCode 75 – Sort Colors

**Difficulty:** Hard

## Problem
Given an array containing only 0, 1, and 2, sort the array in-place so that all 0s appear first, followed by 1s and then 2s.

Built-in sorting functions are not allowed.

## Approach
Used the Dutch National Flag Algorithm with three pointers:

- `low`: Tracks the position for 0.
- `mid`: Checks the current element.
- `high`: Tracks the position for 2.

### Algorithm
1. If the current element is 0, swap it with the element at `low`, then increment `low` and `mid`.
2. If the current element is 1, increment `mid`.
3. If the current element is 2, swap it with the element at `high`, then decrement `high`.
4. Continue until `mid` crosses `high`.

## Example

**Input:** `[2,0,2,1,1,0]`

**Output:** `[0,0,1,1,2,2]`

## Complexity Analysis
- Time Complexity: O(n)
- Space Complexity: O(1)

## Language
Java