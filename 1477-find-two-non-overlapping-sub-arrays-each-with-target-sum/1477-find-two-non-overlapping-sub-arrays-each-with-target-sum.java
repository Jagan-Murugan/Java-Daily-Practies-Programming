class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = n+1;
        int[] left = new int[n+1];
        int right[] = new int[n+1];
        for(int i = 0;i < n;i++){
            left[i] = INF;
            right[i] = INF;
          }
        // prefix sum 
            int start = 0;
            int sum = 0;
            int best = INF;
            for(int end = 0;end<n;end++){
                sum+= arr[end];
                while(sum > target){
                    sum -= arr[start];
                    start++;
                }
                if(sum == target){
                    int len = end - start + 1;
                    best = Math.min(best,len);
                }
                left[end] = best;
            }
            // Suffix
            int end = n -1;
             sum = 0;
             best = INF;
            for(int startin = n-1;startin>0;startin--){
                sum += arr[startin];
                while(sum > target){
                    sum -= arr[end];
                    end--;
                }
                if(sum == target){
                    int len = end - startin+1;
                    best = Math.min(best,len);
                }
                right[startin] = best;
            }
            int ans = INF;
            for(int i=0;i<n-1;i++){
                if(left[i]!=INF && right[i+1]!=INF){
                    ans = Math.min(ans,left[i]+right[i+1]);
                }
            }
            return ans == INF ? -1 : ans;
    }
}