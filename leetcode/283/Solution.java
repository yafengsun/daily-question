class Solution {
    public void moveZeroes(int[] nums) {
        int zeroSum = 0;
        
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == 0){
                zeroSum ++;
            }else{
                nums[i - zeroSum] = nums[i];
            }
        }

        for(int i = nums.length - zeroSum; i < nums.length; i ++){
            nums[i] = 0;
        }
    }
}