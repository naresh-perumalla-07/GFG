# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price
FROM Sales s 
LEFT JOIN Product p 
ON s.product_id=p.product_id;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna