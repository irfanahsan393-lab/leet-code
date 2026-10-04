class Solution {
    public int minRotations(String s) {
        int curr=0;
        int tot=0;
        for(int i=0;i<s.length();i++){
            int next=s.charAt(i)-'0';
            int distance=Math.abs(curr-next);
            int rotation=Math.min(distance,10-distance);
            tot+=rotation;
            curr=next;
        }
        return tot;
    }
}