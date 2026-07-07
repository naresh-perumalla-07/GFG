# [Largest Unblocked Submatrix](https://www.geeksforgeeks.org/problems/largest-unblocked-submatrix/1)
## Medium
You are given integers n and m, and an array arr[][] of size k, where arr[i] = [r, c] represents a blocked cell in an n × m grid.
Each blocked cell blocks its entire row and column. Find the largest continuous unblocked area in the grid.
Note: No two blocked cells are in the same row or the same column.
Examples:
Input: n = 2, m = 2, k = 1, arr[][] = [[2, 2]]
Output: 4
Explanation:Enemies block rows 2 and 5 and columns 1 and 3. Between rows 2 and 5, rows 3 and 4 remain unblocked, giving a maximum row segment of length 2. Between columns 3 and the right boundary, columns 4 and 5 remain unblocked, giving a maximum column segment of length 2. Hence, the largest continuous unblocked rectangle has area 2 × 2 = 4.
Input: n = 2, m = 2, k = 1, arr[][] = [[2, 2]]
Output: 1
Explanation: Since only (1,1) cell is free from the enemy hence answer is 1.
Constraints:1 ≤ n, m ≤ 1040 ≤ k ≤ min(n, m)1 ≤ r&nbsp;≤&nbsp;n1 ≤ c&nbsp;≤ m