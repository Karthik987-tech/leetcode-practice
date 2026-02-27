/* Write your PL/SQL query statement below */
with cte as(
    select turn,person_name,sum(weight) over(order by turn) as new from queue
)
select person_name from cte where new<=1000 and turn=(select max(turn) from cte where new<=1000);
