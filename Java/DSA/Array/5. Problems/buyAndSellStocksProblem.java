
// Best Time to Buy and Sell Stock

/* You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. */


public class buyAndSellStocksProblem {

    public static int buyAndSellStocksBruteForce(int prices[]) { // O(n^2)

        int maxProfit = 0;
        
        // find all the possible profits giving pairs
        for (int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                if (i < j) {
                    // finding the pair having most profit
                    maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
                }
            }
        }
        return maxProfit;
    }


    public static int buyAndSellStocksOptimal(int prices[]) { // O(n)
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's price
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 3, 6, 4};
        // int arr2[] = {7, 6, 4, 3, 1};
        System.out.println(buyAndSellStocksOptimal(arr1));
    }
}
