class Solution {
    public int[] runningSum(int[] nums) {
       if(nums == null || nums.length <= 1) return nums;
        
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                nums[i] = nums[0];
            }
            else{
                nums[i] += nums[i - 1];    
            }
        }
        return nums;
    }
}