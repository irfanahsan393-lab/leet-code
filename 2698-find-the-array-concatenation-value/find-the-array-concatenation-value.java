class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<right){
            String first=String.valueOf(nums[left]);
            String last=String.valueOf(nums[right]);
            String str=first+last;
            ans+=Long.parseLong(str);
            left++;
            right--;
        }
        if(n%2!=0){
            ans+=nums[n/2];
        }
        return ans;
    }
}