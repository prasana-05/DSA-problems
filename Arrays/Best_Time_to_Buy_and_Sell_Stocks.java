//Question:
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

/*
**************************************************************************************************
HINTS:
-----
1) Think about how you can keep track of the lowest price you’ve encountered as you iterate through the array. 
This will help you calculate the potential profit at each day. Start by focusing on maintaining the minimum price observed so far.

2) As you iterate through the array, calculate the potential profit for each day by subtracting the current day's price from the minimum price observed so far. 
Update your maximum profit if this potential profit is higher.

3) Make sure to update the minimum price whenever you encounter a price that is lower than the current minimum. 
This ensures that you always calculate the profit based on the lowest price available up to that point.

4) At the end of the iteration, your maximum profit variable will contain the highest profit you could achieve, given the prices and the constraints. 
If the maximum profit is negative or zero, return 0 as no profit is achievable.
***********************************************************************************************************
*/


class Solution {
    public int maxProfit(int[] prices) {

        int minimum=prices[0];
        int profit=Integer.MIN_VALUE;
        int max_profit=Integer.MIN_VALUE;
        int N=prices.length;

		// in this process we are dynamically calculating the minimum value and profit
        for(int i=1;i<N;i++)
        {
			// we are first checking if curernt element is smaller than the minimum value
            if(prices[i]<minimum)
            {
                minimum=prices[i];
            }
			// then for the current element we are calculating the profit and if the profit is greater than maxProfit then store the value in maxProfit
            profit=prices[i]-minimum;

            if(profit>max_profit)
            {
                max_profit=profit;
            }
        }
		
		//At the end if maxProfit is either 0 or negative, it means that there is no profit, so return 0;
        if(max_profit<=0)
        {
            return 0;
        }

        return max_profit;

        
    }
}