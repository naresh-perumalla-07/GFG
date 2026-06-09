# [Course Schedule I](https://www.geeksforgeeks.org/problems/course-schedule-i/1)
## Medium
You are given&nbsp;n&nbsp;courses, labeled from&nbsp;0 to n - 1 and a 2d array prerequisites[][]&nbsp;where prerequisites[i] =&nbsp;[x, y]&nbsp;indicates that we need to take course&nbsp;y&nbsp;first if we want to take course&nbsp;x.
Find if it is possible to complete all tasks. Return&nbsp;true&nbsp;if all tasks can be completed, or&nbsp;false if it is impossible.
Examples:
Input n = 4, prerequisites[] = [[2, 0], [2, 1], [3, 2]]Output: trueExplanation: To take course 2, you must first finish courses 0 and 1.To take course 3, you must first finish course 2.
All courses can be completed, for example in the order [0, 1, 2, 3] or [1, 0, 2, 3].
Input: n = 3, prerequisites[] = [[0, 1], [1, 2], [2, 0]]Output: falseExplanation: To take course 0, you must first finish course 1. To take course 1, you must first finish course 2. To take course 2, you must first finish course 0.
Since each course depends on the other, it is impossible to complete all courses.
Constraints:1 ≤ n ≤ 104
0 ≤ prerequisites.size() ≤ 105

0 ≤ prerequisites[i][0], prerequisites[i][1] &lt; nAll prerequisite pairs are unique
prerequisites[i][0] ≠ prerequisites[i][1]
