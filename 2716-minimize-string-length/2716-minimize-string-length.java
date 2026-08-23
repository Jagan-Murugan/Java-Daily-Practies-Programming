class Solution {
    public int minimizedStringLength(String s) {
       /* HashSet<Character> ans = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            ans.add(s.charAt(i));
        }
        return ans.size();*/

        String ans ="";
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            boolean duplicate = false;
            for(int j = 0;j < ans.length();j++){
                if(ans.charAt(j)== ch){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                ans = ans+ch;
            }
        }
        return ans.length();
    }
}