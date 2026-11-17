# LeetCode 217 - Contains Duplicate

## Problem
Given an integer array nums, return true if any value
appears at least twice, otherwise return false.

## Approach
Used HashSet to store unique elements.

For every element:
1. Check if it already exists in HashSet.
2. If yes, return true.
3. Otherwise, add it to HashSet.

If no duplicate is found, return false.

## Example

Input: nums = [1,2,3,1]

Output: true

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n)