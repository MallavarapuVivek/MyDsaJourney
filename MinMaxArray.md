# Find Minimum and Maximum in an Array

## Problem
Given an array of integers, find the minimum and maximum element.

## Approach
- Use Java’s built-in `Arrays.stream()` to compute min and max.
- Time Complexity: O(n)
- Space Complexity: O(1)

## Code
```java
int min = Arrays.stream(nums).min().getAsInt();
int max = Arrays.stream(nums).max().getAsInt();
