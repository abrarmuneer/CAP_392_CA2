class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int[] account : accounts) {

            int sum = 0;

            for (int j = 0; j < account.length; j++) {
                sum = sum + account[j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}