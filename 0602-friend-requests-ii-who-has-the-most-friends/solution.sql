with cte as(
select requester_id from RequestAccepted
union all
select accepter_id from requestAccepted),
friend as(
select requester_id,count(*) as cou from cte group by requester_id)
select requester_id as id,cou as num from friend where cou=(select max(cou) from friend);
