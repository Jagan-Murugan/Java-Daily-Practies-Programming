class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] present = new boolean[26];
        for(int i = 0;i<allowed.length();i++){
            char ch = allowed.charAt(i);
            present[ch - 'a'] = true; 
        }
        
            int count = 0;
        for(String word :words){
            boolean consistent = true;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!present[ch - 'a']){
                consistent = false;
                break;
                }
            }
            if(consistent){
                count++;
            }
        }
        return count;
        
    }
}