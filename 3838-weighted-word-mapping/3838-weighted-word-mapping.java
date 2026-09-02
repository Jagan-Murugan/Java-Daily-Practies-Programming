class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

   // StringBuilder result = new StringBuilder();
    // this use  alternate
    String str ="";   
    for(String word : words){
        int sum = 0;
        for(int i = 0;i < word.length();i++){
            char ch = word.charAt(i);
            sum += weights[ch - 'a'];
        }
        int remainder = sum % 26;

        char map = (char) ('z' - remainder);
       // result.append(map);
       str = str+map;
    }
  //  return result.toString();
  return str;
    }
}