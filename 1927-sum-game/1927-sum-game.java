class Solution {
    public boolean sumGame(String num) {
        int n = num.length()/2;
        int left = 0;
        int right = 0;
        int leftques = 0,rightques = 0;
        for(int i = 0;i<n;i++){
        char ch = num.charAt(i);
        if(ch == '?'){
            leftques++;
        }   
        else{
            left += ch-'0';
        }
        }
        for(int i = n;i < num.length();i++){
            char ch = num.charAt(i);
            if(ch == '?')
            rightques++;
            else{
                right += ch-'0';
            }
        }
        if((leftques + rightques) % 2 == 1){
            return true;
        }
        int diff = left - right;
        return 2 * diff != 9 * (rightques - leftques);
       
    }
}