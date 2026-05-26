# [Replace O's with X's](https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1)
## Medium
You are given a grid[][] of size n*m, where every element is either 'O' or 'X'. You have to replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'. 
A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.
Examples:
Input: grid[][] = [['X', 'X', 'X', 'X'],           ['X', 'O', 'X', 'X'],           ['X', 'O', 'O', 'X'],           ['X', 'O', 'X', 'X'],           ['X', 'X', 'O', 'O']]
Output: [['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'X', 'O', 'O']]
Explanation: We only changed those 'O' that are surrounded by 'X'

Input: grid[][] = [['X', 'O', 'X', 'X'],           ['X', 'O', 'X', 'X'],           ['X', 'O', 'O', 'X'],           ['X', 'O', 'X', 'X'],           ['X', 'X', 'O', 'O']]
Output: [['X', 'O', 'X', 'X'], ['X', 'O', 'X', 'X'], ['X', 'O', 'O', 'X'], ['X', 'O', 'X', 'X'], ['X', 'X', 'O', 'O']]
Explanation: There's no 'O' that's surround by 'X'.
Input: grid[][] = [['X', 'X', 'X'],           ['X', 'O', 'X'],           ['X', 'X', 'X']]
Output: [['X', 'X', 'X'], ['X', 'X', 'X'], ['X', 'X', 'X']]
Explanation: There's only one 'O' that's surround by 'X'.
Constraints:1 ≤ grid.size() ≤ 1001 ≤ grid[0].size() ≤ 100