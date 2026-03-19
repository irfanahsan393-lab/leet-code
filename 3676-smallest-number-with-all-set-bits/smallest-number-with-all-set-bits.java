class Solution {
    public int smallestNumber(int n) {
        int bin_num=0;
        while(n>0){
            bin_num=bin_num*10+1;
            n/=2;
        }
        int ans=0;
        int i=0;
        while(bin_num>0){
            ans+=Math.pow(2,i);
            bin_num/=10;
            i++;
        }
        return ans;        
    }   
}