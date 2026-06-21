# Exercise: Financial Forecasting

## Sample Output
Future value after 3 years: 1157.625
## Recursion
Recursion is when a method calls itself to solve smaller parts of a problem.

Example: Predicting future value of ₹1000 with 5% growth.
- Year 1: 1000 * 1.05 = 1050
- Year 2: 1050 * 1.05 = 1102.5
- Year 3: 1102.5 * 1.05 = 1157.625

This matches the recursive function output.

## Time Complexity
Recursive forecasting has O(n) time complexity for n years.

## Optimization
Instead of recursion, we can use the formula:
Future Value = Current * (1 + rate)^years  
This avoids repeated recursive calls and is more efficient.
