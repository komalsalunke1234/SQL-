# Write your MySQL query statement below
-- SELECT p.firstName,p.lastName,a.city,a.state
-- FROM person as p
-- LEFT JOIN Address as a
-- ON p.personId=a.personId;

SELECT firstName,lastName,city,state
FROM Person 
LEFT JOIN Address 
ON Person.personId = Address.personId;
