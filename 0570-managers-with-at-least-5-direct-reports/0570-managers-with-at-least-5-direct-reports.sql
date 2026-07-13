# Write your MySQL query statement below
SELECT m.name
FROM Employee e
JOIN Employee m
ON e.managerId=m.id
GROUP BY m.id,m.name
HAVING COUNT(*)>=5;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna