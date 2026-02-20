/* Write your PL/SQL query statement below */
select d.name as Department,e.name as Employee,e.salary as Salary from employee e
join department d
on e.departmentId=d.id
where salary= (select max(salary) from employee where departmentid =e.departmentid);
