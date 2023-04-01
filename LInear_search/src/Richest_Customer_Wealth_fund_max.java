/* https://leetcode.com/problems/richest-customer-wealth/ */
public class Richest_Customer_Wealth_fund_max {
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {

            // when we start a new col take a sum of that row
            int sum = 0;
            for (int i : account) {
                sum += i;
            }

            // now we have the sum of account
            // now we can check the overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
