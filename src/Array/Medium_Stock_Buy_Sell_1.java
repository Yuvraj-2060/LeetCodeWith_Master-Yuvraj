package Array;

//Problem 122:  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
public class Medium_Stock_Buy_Sell_1 {

    public static int maxProfit(int[] prices) {

        int maxProfit =0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1])
                maxProfit += prices[i]-prices[i-1];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum Profit Is : "+maxProfit);
    }
}
