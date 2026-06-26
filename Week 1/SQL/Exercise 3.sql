-- Scenarion 1

DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

END $$

DELIMITER ;

CALL ProcessMonthlyInterest();

SELECT * FROM Accounts;

-- Scenario 2 

DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept VARCHAR(50),
    IN bonusPercent DECIMAL(5,2)
)
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * bonusPercent / 100)
    WHERE Department = dept;

END $$

DELIMITER ;

CALL UpdateEmployeeBonus('IT', 10);

SELECT * FROM Employees;

-- Scenario 3

USE BankDB;
DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN transferAmount DECIMAL(10,2)
)
BEGIN
    DECLARE currentBalance DECIMAL(10,2);

    SELECT Balance
    INTO currentBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    IF currentBalance >= transferAmount THEN

        UPDATE Accounts
        SET Balance = Balance - transferAmount
        WHERE AccountID = fromAccount;

        UPDATE Accounts
        SET Balance = Balance + transferAmount
        WHERE AccountID = toAccount;

        SELECT 'Transfer Successful' AS Message;

    ELSE

        SELECT 'Insufficient Balance' AS Message;

    END IF;

END$$

DELIMITER ;

CALL TransferFunds(1,2,1000);

