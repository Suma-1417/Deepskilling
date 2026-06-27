
-- Example 1: Apply discount for customers above 60 years
BEGIN
    FOR c IN (SELECT customer_id, age FROM customers) LOOP
        IF c.age > 60 THEN
            UPDATE loans
            SET interest_rate = interest_rate - 0.01
            WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;
END;
/

-- Example 2: Promote customers with balance > 10,000 to VIP
BEGIN
    FOR c IN (SELECT customer_id, balance FROM accounts) LOOP
        IF c.balance > 10000 THEN
            UPDATE accounts
            SET is_vip = 'Y'
            WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;
END;
/

-- Example 3: Send loan reminders for loans due in 30 days
BEGIN
    FOR l IN (SELECT loan_id, due_date FROM loans) LOOP
        IF l.due_date <= SYSDATE + 30 THEN
            DBMS_OUTPUT.PUT_LINE('Reminder: Loan due for loan_id ' || l.loan_id);
        END IF;
    END LOOP;
END;
/
