# LeetCode 121 - Best Time to Buy and Sell Stock

## Problem
Given an array of stock prices, find the maximum profit that can be achieved by buying on one day and selling on a future day.

If no profit is possible, return 0.

## Approach
Used a Greedy approach.

1. Initialize minPrice with Integer.MAX_VALUE.
2. Initialize maxProfit with 0.
3. Traverse the prices array.
4. Update minPrice whenever a lower price is found.
5. Calculate the possible profit by subtracting minPrice from the current price.
6. Update maxProfit if a higher profit is found.
7. Return maxProfit.

## Example

Input:
prices = [7,1,5,3,6,4]

Output:
5

Explanation:
Buy at price 1 and sell at price 6.
Maximum Profit = 6 - 1 = 5.

## Complexity
Time Complexity: O(n)

Space Complexity: O(1)