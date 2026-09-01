class Solution {
    public String reversePrefix(String s, int k) {
        String first = s.substring(0,k);
        String last = s.substring(k);
        StringBuilder sb = new StringBuilder(first);
        sb.reverse();
        return sb.toString()+ last;

    }
}