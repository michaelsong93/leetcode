class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newShuffle = new int[nums.length];
        int[] half = new int[n];
        int idx = 0;
        
        for(int i = 0; i < n; i++){
            half[i] = nums[nums.length/2+i];
        }
        
        for(int i = 0; i < n; i++){
            newShuffle[idx++] = nums[i];
            newShuffle[idx++] = half[i];
            
        }
        return newShuffle;
    }
}