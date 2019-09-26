select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 0));
 
select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 1));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 2));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 3));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 4));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 5));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 6));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 7));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 8));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 9));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 10));

select distinct(eventname), totalTicketsSold, totalprice, saletime, catgroup, catname, catdesc from
(select * from (select eventid, sum(numtickets) as totalTicketsSold, sum(totalprice) as totalPrice from listing  group by eventid order by totalTicketsSold desc limit 3) as A join event on A.eventid = event.eventid join sales on A.eventid = sales.eventid) as B
join category on B.catid = category.catid
where extract(month from saletime) = extract(month FROM add_months(CURRENT_DATE, 11));


