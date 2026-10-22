class Solution {
    public int maxOperations(int[] nums) {
        int n=nums.length;
        int left=0;
        int ans=0;
        int count=0;
        while(n>=2){
            int sum=nums[left]+nums[left+1];
            if(ans==0&&sum!=0){
                ans=sum;
            }
            if(ans==sum){
                count++;
            }
            else{
                break;
            }
            left+=2;
            n-=2;
        }
        return count;
    }
}