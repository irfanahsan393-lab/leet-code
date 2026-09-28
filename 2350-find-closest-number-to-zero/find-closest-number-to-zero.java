class Solution {
    public int findClosestNumber(int[] nums) {
        int diff=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            diff=Math.abs(nums[i]-0);
            if((diff<min)||(diff==min&&nums[i]>ans)){
                min=diff;
                ans=nums[i];
            }
        }
        return ans;        
    }
}