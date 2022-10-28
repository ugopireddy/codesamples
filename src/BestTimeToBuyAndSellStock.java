public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        int max = maxProfit(prices);
        System.out.println("max profit: "+ max);
    }

    private static int maxProfit(int[] prices) {
        int max=0;
        int min = Integer.MAX_VALUE;

        for (int i : prices){
            if( i < min){
                min = i;
            }else{
                max = Math.max(max, i-min);
            }
        }
        return max;
    }
}
