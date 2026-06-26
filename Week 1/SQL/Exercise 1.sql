-- Scenario 1
SET SQL_SAFE_UPDATES = 0;
UPDATE Loans l
JOIN Customers c
ON l.CustomerID=c.CustomerID
SET l.InterestRate=l.InterestRate-1
WHERE TIMESTAMPDIFF(YEAR,c.DOB,CURDATE())>60;

SELECT * FROM Loans;

-- Scenario 2

UPDATE Customers
SET IsVIP=TRUE
WHERE Balance>10000;

SELECT * FROM Customers;

-- Scenario 3

SELECT
c.Name,
l.LoanID,
l.EndDate
FROM Customers c
JOIN Loans l
ON c.CustomerID=l.CustomerID
WHERE l.EndDate BETWEEN CURDATE()
AND DATE_ADD(CURDATE(),INTERVAL 30 DAY);

