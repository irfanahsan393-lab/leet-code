class Solution {
    public int firstMatchingIndex(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                ans=i;
                break;
            }
            ans=-1;
        }
        return ans;
    }
}