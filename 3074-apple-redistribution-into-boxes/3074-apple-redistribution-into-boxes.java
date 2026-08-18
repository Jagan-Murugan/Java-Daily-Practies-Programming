class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count = 0,total = 0;
        int sum = 0;
        for(int i = 0;i<apple.length;i++){
            total +=apple[i];
        }
            for(int j =0;j<capacity.length;j++){
                int max= -1;
                int index = -1;
                for(int k = 0;k<capacity.length;k++){
                    if(capacity[k]>max){
                        max = capacity[k];
                        index = k;
                    }
                }
                sum += max;
                count++;

                capacity[index] = -1;
                if(total<=sum){
                    return count;
                }
            }
        return count;
        
    }
}