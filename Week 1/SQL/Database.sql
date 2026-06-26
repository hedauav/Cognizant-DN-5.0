CREATE DATABASE BankDB;

USE BankDB;

CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2),
    LastModified DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    DOB DATE,
    Balance DECIMAL(10,2),
    IsVIP BOOLEAN DEFAULT FALSE,
    LastModified DATE
);

CREATE TABLE Transactions (
    TransactionID INT PRIMARY KEY,
    AccountID INT,
    TransactionDate DATE,
    Amount DECIMAL(10,2),
    TransactionType VARCHAR(20),
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    LoanAmount DECIMAL(10,2),
    InterestRate DECIMAL(5,2),
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Position VARCHAR(50),
    Salary DECIMAL(10,2),
    Department VARCHAR(50),
    HireDate DATE
);

INSERT INTO Customers VALUES
(1,'John Doe','1955-05-15',12000,FALSE,CURDATE()),
(2,'Jane Smith','1995-07-20',8000,FALSE,CURDATE()),
(3,'Robert','1950-10-12',15000,FALSE,CURDATE());

INSERT INTO Accounts VALUES
(1,1,'Savings',12000,CURDATE()),
(2,2,'Savings',8000,CURDATE()),
(3,3,'Checking',15000,CURDATE());

INSERT INTO Loans VALUES
(1,1,50000,8,CURDATE(),DATE_ADD(CURDATE(),INTERVAL 20 DAY)),
(2,2,60000,9,CURDATE(),DATE_ADD(CURDATE(),INTERVAL 60 DAY)),
(3,3,70000,7,CURDATE(),DATE_ADD(CURDATE(),INTERVAL 10 DAY));

INSERT INTO Employees VALUES
(1,'Alice','Manager',70000,'HR','2018-01-10'),
(2,'Bob','Developer',60000,'IT','2019-05-20'),
(3,'Charlie','Developer',50000,'IT','2020-06-10');

INSERT INTO Transactions VALUES
(1,1,CURDATE(),5000,'Deposit'),
(2,2,CURDATE(),1000,'Withdrawal'),
(3,3,CURDATE(),2500,'Deposit');