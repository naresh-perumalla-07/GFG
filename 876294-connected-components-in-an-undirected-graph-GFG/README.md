# [Connected Components in an Undirected Graph](https://www.geeksforgeeks.org/problems/connected-components-in-an-undirected-graph/1)
## Medium
Given an undirected graph with&nbsp;V&nbsp;vertices numbered from 0 to V-1 and&nbsp;E&nbsp;edges, represented as a 2D array&nbsp;edges[][], where each entry&nbsp;edges[i] = [u, v]&nbsp;denotes an edge between vertices&nbsp;u&nbsp;and&nbsp;v.
Your task is to return a list of all connected components. Each connected component should be represented as a list of its vertices, with all components returned in a collection where each component is listed separately.
Note:&nbsp;You can return the components in any order, driver code will print the components in&nbsp;sorted&nbsp;order.
Examples :
Input: V = 5, edges[][] = [[0, 1], [2, 1], [3, 4]]
Output: [[0, 1, 2], [3, 4]]
Explanation:
Input: V = 7, edges[][] = [[0, 1], [6, 0], [2, 4], [2, 3], [3, 4]]
Output: [[0, 1, 6], [2, 3, 4], [5]]Explanation:
Constraints:1 ≤ V, E ≤ 1050 ≤ edges[i][0], edges[i][1] &lt; V