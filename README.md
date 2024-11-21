# Array Operations in Java

This repository contains Java programs that perform various operations on arrays. The code demonstrates methods to manipulate, sort, merge, and analyze arrays, including finding the sum, average, min, max, and odd numbers, as well as shifting elements within arrays.

## How to Run
1. Download or clone the repository to your local machine.
2. Open each `.java` file in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) or compile and run them from the command line.
3. Execute the `main()` method in any of the classes to see the results.

## Customization
You can change the data in any of the programs at any time to suit your needs. Customize the input arrays to achieve specific goals, whether you are working with different sets of numbers or adjusting the operations to fit a particular use case. The flexibility of these programs allows for a wide range of modifications to meet your individual requirements.


## Files

### 1. `ArratoMethod.java`
This program demonstrates multiple array operations, including:
- Calculating the sum, average, minimum, and maximum values of an array.
- Identifying and summing odd numbers in an array.
- Shifting the elements of an array both to the left and the right.

### 2. `arraysMerge.java`
This program merges two integer arrays into one and then sorts the merged array. It contains:
- Merging two arrays of integers (`a` and `b`) into a third array (`c`).
- Sorting the merged array using both built-in sorting methods and a manual bubble sort approach.
- The final merged and sorted array is printed.

### 3. `arraySort.java`
This program demonstrates the Bubble Sort algorithm:
- It sorts an integer array in ascending order and prints the sorted array.
- It also finds and prints the largest and smallest numbers in the array.

## Example Output

1. For `ArratoMethod.java`, the output could be:
- The array sum = 105
- The array average = 5
- The array minimum value = -58
- The array maximum value = 33
- The odd numbers count = 8
- The odd numbers are: 3 5 15 33 17 9 1 19
- The left shifted array = [12, 18, 19, 22, 33]
- The right shifted array = [33, 12, 18, 19, 22]

2. For `arraysMerge.java`, the output could be:
- merged array: [1, 2, 3, 7, 9, 0, 18, 36, -8, 4, -5, 5, 6, 9, 22] 
- merged array sorted: [-8, -5, 0, 1, 2, 3, 4, 5, 6, 7, 9, 9, 18, 22, 36]


3. For `arraySort.java`, the output could be:
- original array: 1 4 5 3 6 8 12 45 -5 -7 0 
- Sorted array: -7 -5 0 1 3 4 5 6 8 12 45 
- the largest array number is: 45 
- the smallest array number is: -7


