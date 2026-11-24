package slidingwindow;

public  class  BestTimeToBuySell {
    public  int maxProfit(int[] prices){ // O(n) Time & O(1) Space 
        if(prices == null || prices.length <2)
            return 0;
        int costPrice = prices[0];
        int maxProfit =0;
        for(int i=1;i< prices.length;i++){
            if(costPrice>prices[i])
                costPrice=prices[i];
            else{
               int current_profit=  prices[i]-costPrice;
               maxProfit = Math.max(current_profit,maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        var solver = new BestTimeToBuySell();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit (Test 1): " + solver.maxProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit (Test 2): " + solver.maxProfit(prices2));

        int[] prices3 = {5};
        System.out.println("Max Profit (Test 3): " + solver.maxProfit(prices3));

    }
}
