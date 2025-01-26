public class D05_Buy_and_Sell_Stocks {
    public static void buyAndSellStocks(int prices[]){
        int minPrices[] = new int[prices.length];
        minPrices[0] = prices[0];
        for(int i =1;i<prices.length;i++){
            minPrices[i] = Math.min(minPrices[i-1], prices[i]);
        }

        int profit = 0;
        int maxProfit = 0;
        for(int i =0;i<prices.length;i++){
            profit = prices[i] - minPrices[i];
            maxProfit = Math.max(maxProfit,profit);
        }

        System.out.println("Maximum profit = "+maxProfit);
    }
    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        buyAndSellStocks(prices);
    }
}
