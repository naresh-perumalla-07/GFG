# Write your MySQL query statement below
SELECT p.project_id,ROUND(AVG(e.experience_years),2) AS average_years
FROM Employee e
LEFT JOIN Project p
ON p.employee_id=e.employee_id
GROUP BY p.project_id
HAVING p.project_id IS NOT NULL

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna