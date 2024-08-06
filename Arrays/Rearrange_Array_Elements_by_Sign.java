//Question:
/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

    Every consecutive pair of integers have opposite signs.
    For all integers with the same sign, the order in which they were present in nums is preserved.
    The rearranged array begins with a positive integer.

Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]

LINK : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

*/

/*
*******************************************************
HINTS:
1) First, think about how you can separate the positive and negative numbers from the array while maintaining their original order.
2) Once you have the positive and negative numbers separated, 
consider how you can merge them to meet the requirement that every consecutive pair has opposite signs, starting with a positive number.
*******************************************************
*/


class Solution {
    public int[] rearrangeArray(int[] nums) {

        int pos[]= new int[nums.length/2];
        int neg[]= new int[nums.length/2];
        int result[]= new int[nums.length];
        int pos_index=0;
        int neg_index=0;
		
		// seperate the oririnal array into two arrays with positive and negative numbers
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos[pos_index]=nums[i];
                pos_index++;
            }
            else
            {
                neg[neg_index]=nums[i];
                neg_index++;
            }
        }

		// now merge the positive and negative arrays into new array every consecutive pair of integers have opposite signs
        for(int j=0;j<nums.length/2;j++)
        {
            result[j+j]=pos[j];
            result[j+j+1]=neg[j];
        }

        return result;
        
    }
}