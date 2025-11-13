# Write your MySQL query statement below
select empUni.unique_id, e.name
from  Employees e
Left Join EmployeeUNI empUni
on e.id = empUNI.id;