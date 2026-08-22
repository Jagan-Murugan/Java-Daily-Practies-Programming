class Solution {
    public String restoreString(String s, int[] indices) {
        
        // char[] res = new char[indices.length];
        // for(int i = 0;i<s.length();i++){
        //     res[indices[i]] = s.charAt(i);
        // }
        // String temp = "";
        // for(int j = 0;j < res.length;j++){
        //     temp = temp+res[j];
        // }
        // return temp;

        char[] ans = new char[s.length()];
        for(int i = 0;i < indices.length;i++){
            ans[indices[i]] = s.charAt(i); 
        }
        return new String(ans);
    }
}