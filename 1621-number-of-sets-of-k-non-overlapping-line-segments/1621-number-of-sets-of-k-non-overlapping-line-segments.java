class Solution {
    public int numberOfSets(int n, int k) {
        int MOD = 1000000007;
        int N = n+k-1;
        int[][] dp = new int[N+1][N+1];
        for(int i = 0;i<=N;i++){
            dp[i][0] = 1;
        }
        for(int i = 1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(i == j){
                    dp[i][j] = 1;
                }
                else{

                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                dp[i][j] = dp[i][j] % MOD;
                }
            }
        }
        return dp[N][2*k];
    }
}