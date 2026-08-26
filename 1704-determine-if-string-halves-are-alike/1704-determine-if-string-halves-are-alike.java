class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        int mid = str.length() / 2;
        String vowel = "aeiou";
        for(int i = 0;i < mid;i++){
            char ch = str.charAt(i);
            if(vowel.indexOf(ch)!=-1){
                count1++;
            }
        }
        for(int i = mid;i<str.length();i++){
            if(vowel.indexOf(str.charAt(i)) != -1)
            count2++;
        }
        return count1 == count2;
    }
}