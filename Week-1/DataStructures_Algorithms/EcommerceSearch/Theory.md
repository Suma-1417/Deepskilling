

# Exercise: E-commerce Platform Search Function

## Sample Output:
Linear Search result: 1
Binary Search result: 2

## Big O Notation
Big O notation describes how the runtime of an algorithm grows with input size.

- Linear Search: O(n)
- Binary Search: O(log n)

## Best, Average, Worst Case
- Linear Search:
  - Best: O(1) → Example: Searching for "Laptop" at index 0.
  - Average: O(n/2) → Example: Searching for "Shoes" in the middle of the list.
  - Worst: O(n) → Example: Searching for "Phone" at the end or a product not present.

- Binary Search:
  - Best: O(1) → Example: If "Shoes" happens to be at the middle after sorting.
  - Average/Worst: O(log n) → Example: Searching for "Shoes" in a sorted array of products.

## Analysis
For small arrays (like 3 products: Laptop, Shoes, Phone), linear search is fine.  
For large catalogs (thousands of products), binary search is more efficient — but it requires the array to be sorted.
-->Conclusion:Binary search is faster for large, sorted datasets. Linear search is simpler and works on unsorted data.
