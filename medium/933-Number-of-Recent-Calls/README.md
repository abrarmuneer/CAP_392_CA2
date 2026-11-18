# LeetCode 933 - Number of Recent Calls

## Problem
Implement a RecentCounter class that counts the number of requests received in the last 3000 milliseconds.

## Approach
Used Queue data structure.

1. Create a Queue to store request timestamps.
2. Add the new timestamp using add().
3. Remove timestamps smaller than t - 3000.
4. Return the current queue size.

## Example

Input:
ping(1)
ping(100)
ping(3001)
ping(3002)

Output:
1, 2, 3, 3

## Complexity
Time Complexity: O(1) amortized per ping operation.

Space Complexity: O(n)