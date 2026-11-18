# LeetCode 33 – Search in Rotated Sorted Array

**Difficulty:** Hard

## Problem
Given a sorted array that has been rotated at an unknown position, find the index of a given target. Return -1 if the target is not present.

The solution must run in O(log n) time.

## Approach
Used Modified Binary Search.

### Algorithm
1. Initialize two pointers: `left` and `right`.
2. Calculate the middle index.
3. If the middle element equals the target, return its index.
4. Check whether the left half is sorted.
5. If the target belongs to the sorted half, search there.
6. Otherwise, search the other half.
7. Repeat until the target is found or the search space becomes empty.

## Example

**Input:** `nums = [4,5,6,7,0,1,2]`, `target = 0`

**Output:** `4`

**Explanation:** The target 0 is present at index 4.

## Complexity Analysis
- Time Complexity: O(log n)
- Space Complexity: O(1)

## Language
Java