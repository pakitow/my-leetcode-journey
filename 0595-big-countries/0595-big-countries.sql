# Write your MySQL query statement below
select name, population, area
from World
where population>=(25*power(10,6)) or area>=(3*power(10,6));