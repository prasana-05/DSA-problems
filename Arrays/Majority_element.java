//Question:
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



class Solution {
    public int majorityElement(int[] nums) {

        int counter=0;
        int candidate=Integer.MIN_VALUE;
        int N=nums.length;

        for(int i=0;i<N;i++)
        {
            if(counter==0)
            {
                candidate=nums[i];
            }

            if(candidate==nums[i])
            {
                counter++;
            }
            else
            {
                counter--;
            }
        }

        return candidate;
    }
}