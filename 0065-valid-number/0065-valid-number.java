class Solution {
    public boolean isNumber(String s) {
        boolean digitseen = false;
        boolean dotseen = false;
        boolean exponentseen =false;
        boolean digitexponentseen = true;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
// DIGIT CHECK
            if(ch >='0' && ch<='9'){
                digitseen = true;
                // DIGIT + EXPONENT CHECK
                if(exponentseen){
                    digitexponentseen = true;
                }
            }
            else if(ch == '.'){
                if(dotseen || exponentseen){
                    return false;
                }
                dotseen = true;
            }
            else if(ch == 'e' || ch == 'E'){
                if(!digitseen||exponentseen){
                    return false;
                }
                exponentseen = true;
                digitexponentseen = false;
            }
            //  SYMBOL + & -;
            else if( ch == '+' || ch == '-'){
                    // SIGN ANY ONE IS BEGINNING
                    // AFTER IMMEDIATELY E/e
                    if(i !=0 &&
                    s.charAt(i-1) != 'e'&&
                    s.charAt(i-1) != 'E'){
                        return false;
                    } 
            }
                    else{
                        return false;
                    }
        }
        return digitseen && digitexponentseen;
    }
}