class Solution {
    public int countValidSelections(int[] nums){
        int n=nums.length;
        int count=0;
        for (int i=0;i<n;i++){
            if(nums[i]!=0){
                continue;
            }
            int leftSum=0;
            int rightSum=0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }
            for(int j=i+1;j<n;j++){
                rightSum += nums[j];
            }
            if(leftSum==rightSum){
                count += 2;
            }
            else if (Math.abs(leftSum - rightSum) == 1) {
                count++;
            }
        }
        return count;
    }
}