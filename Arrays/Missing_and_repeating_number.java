//Question:
/*Given an unsorted array arr of size n of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. 
Find these two numbers.
Your task is to complete the function findTwoElement() which takes the array of integers arr and n as parameters and returns an array of integers of 
size 2 denoting the answer (The first index contains B and second index contains A)

Input: n = 3 arr[] = {1, 3, 3} 
Output: 3 2
Explanation: Repeating number is 3 and smallest positive missing number is 2.

*/

/*
*****************************************************************
HINTS:
1) Iterate through the array and for each element, if it is not in the correct position (i.e., arr[i] != arr[arr[i] - 1]), 
swap it with the element at its correct position until each element is in its correct position or it finds a duplicate.
2) In the second pass, check each index i. If arr[i] is not equal to i + 1, then arr[i] is the duplicate number and i + 1 is the missing number.
*****************************************************************
*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // Place each number in its correct position
        int i = 0;
        while (i < n) {
            if (arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int correctIndex = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Identify the duplicate and missing numbers
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return new int[]{arr[i], i + 1}; // arr[i] is duplicate, i + 1 is missing
            }
        }

        // Return default values if no duplicate or missing number is found
        return new int[]{-1, -1};
        
        }
        
    }