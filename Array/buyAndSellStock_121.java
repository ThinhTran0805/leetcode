import java.util.Scanner;

public class buyAndSellStock_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock price: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        System.out.println("Max profit is: " + maxProfit);
    }
}
