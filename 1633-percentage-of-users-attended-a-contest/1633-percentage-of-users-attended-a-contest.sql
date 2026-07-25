-- # Write your MySQL query statement below
-- SELECT r.contest_id,AVG()
-- FROM Users u
-- LEFT JOIN Register r
-- ON u.user_id=r.user_id
-- GROUP BY r.user_id
-- ORDER BY 


SELECT
    r.contest_id,
    ROUND(COUNT(r.user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, contest_id ASC;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna