# LeetCode 1672 – Richest Customer Wealth

## Problem Description
You are given a 2D integer array called accounts. Each row represents a customer, and each column represents money in a bank account.

Find the maximum total wealth of any customer.

## Approach
We use nested loops to calculate the total wealth of every customer.

1. The outer loop selects each customer.
2. The inner loop adds the money from all their bank accounts.
3. We compare the total with maxWealth.
4. Finally, we return the maximum wealth.

## Example

Input:
[[1, 2, 3], [3, 2, 1]]

Output:
6

Explanation:
Customer 1 = 1 + 2 + 3 = 6

Customer 2 = 3 + 2 + 1 = 6

Maximum Wealth = 6

## Complexity Analysis

- Time Complexity: O(m × n)
- Space Complexity: O(1)

## Concepts Used
- 2D Arrays
- Nested Loops
- Variables
- Conditional Statements