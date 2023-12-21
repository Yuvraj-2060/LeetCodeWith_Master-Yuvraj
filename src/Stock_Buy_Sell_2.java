public class Stock_Buy_Sell_2 {
    public static int maxProfit(int[] prices) {
        int buy_At_Min = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0;i<prices.length;i++){
            buy_At_Min = Math.min(buy_At_Min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-buy_At_Min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        int maxProfit = maxProfit(arr);
        System.out.println("Maximum Profit Is : "+maxProfit);
    }
}
