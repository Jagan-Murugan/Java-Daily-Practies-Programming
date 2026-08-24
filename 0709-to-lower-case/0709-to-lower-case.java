class Solution {
    public String toLowerCase(String s) {
        String str = "";
        for(int i = 0;i < s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            str = str+ch;
        }
        return str;
    }
}