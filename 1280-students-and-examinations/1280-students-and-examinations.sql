# Write your MySQL query statement below
SELECT t.student_id,t.student_name,t.subject_name,COUNT(e.student_id)AS attended_exams

FROM(
    SELECT s.student_id,s.student_name,sub.subject_name
    FROM Students s
    CROSS JOIN Subjects sub

)t 
LEFT JOIN Examinations e

ON t.student_id=e.student_id AND
   t.subject_name=e.subject_name
GROUP BY t.student_id,t.student_name,t.subject_name
ORDER BY t.student_id,t.student_name;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna