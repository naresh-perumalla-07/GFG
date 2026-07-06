# [Max Sum Path in Two Arrays](https://www.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1)
## Medium
Given two sorted arrays of distinct integers in increasing order a[] and b[], which may have some common elements, find the maximum sum of a path from the beginning of any array to the end of any array. You may switch from one array to the other only at common elements.
Note:&nbsp; When switching, count the common element only once.
Examples :&nbsp;
Input: a[] = [2, 3, 7, 10, 12], b[] = [1, 5, 7, 8]
Output: 35
Explanation: The path will be (1 + 5 + 7 + 10 + 12) = 35, where 1 and 5 come from arr2 and then 7 is common so we switch to arr1 and add 10 and 12.
Input: a[] = [1, 2, 3], b[] = [3, 4, 5]
Output: 15
Explanation: The path will be (1 + 2 + 3 + 4 + 5) = 15.
Constraints:1&nbsp;≤&nbsp;a.size(), b.size() ≤&nbsp;1041&nbsp;≤ a[i], b[i] ≤&nbsp;105