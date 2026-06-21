-- Scenario 1: Monthly interest update
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR s IN (SELECT account_id, balance FROM savings) LOOP
        UPDATE savings
        SET balance = balance*1.01

        WHERE account_id = s.account_id;
    END LOOP;
END ;
/

-- Scenario 2: Employee bonus update
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept_id NUMBER, bonus_pct NUMBER) IS
BEGIN
    UPDATE employees
   SET salary = salary + (salary * bonus_pct / 100)
    WHERE department_id = dept_id;
END;
/

-- Scenario 3: Transfer funds between accounts
CREATE OR REPLACE PROCEDURE TransferFunds(src NUMBER, dest NUMBER, amt NUMBER) IS
    bal NUMBER;
BEGIN
    SELECT balance INTO bal FROM accounts WHERE account_id = src;
    IF bal >= amt THEN
        UPDATE accounts SET balance = balance - amt WHERE account_id = src;
        UPDATE accounts SET balance = balance + amt WHERE account_id = dest;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
    END IF;
END;
/
