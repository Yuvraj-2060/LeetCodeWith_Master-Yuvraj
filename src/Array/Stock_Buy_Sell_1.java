package Array;//Problem 121: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Stock_Buy_Sell_1 {
    public static int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] > prices[i])
                    maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum Profit Is : "+maxProfit);
    }
}
