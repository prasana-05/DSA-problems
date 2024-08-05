//Question:
//Given a sorted array A containing N integers both positive and negative.
//You need to create another array containing the squares of all the elements in A and return it in non-decreasing order.


public class Solution {
    public int[] solve(int[] A) {
        
		//Create a new array with same size of input array A
        int ans[]= new int[A.length];
        
		//Iterate over the array and calculate the square of each element
        for(int i=0;i<A.length;i++)
        {
            ans[i]= A[i]*A[i];
        }
        
		//Sort the result array since we need to return it in non-decreasing order
        Arrays.sort(ans);
        
        return ans;
    }
}