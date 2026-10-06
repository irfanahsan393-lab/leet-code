class Solution {
    public boolean checkGoodInteger(int n) {
        long digitsum=0;
        long squaresum=0;
        while(n>0){
            long digit=n%10;
            digitsum+=digit;
            squaresum=squaresum+(digit*digit);
            if(squaresum-digitsum>=50){
                return true;
            }
            n/=10;
        }
        return false;        
    }
}