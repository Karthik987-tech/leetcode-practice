/* Write your PL/SQL query statement below */
with cte as(
select d.name as Department,e.name as Employee,e.salary as Salary,dense_rank() over(partition by d.name order by e.salary desc) as extra from employee e
join 
department d
on e.departmentid=d.id) 
select Department,Employee,Salary from cte where extra <=3 ;

