class Solution {
    public int[] shuffle(int[] nums, int n) {
        // x 转换 2 * 数组下标 
        // y 转换 2 * (数组下标 - n) + 1
        int[] result = new int[2 * n];

        for(int i = 0; i < n; i ++){
            result[ 2 * i] = nums[i];
        }

        for(int i = n; i < (2 * n); i ++){
            result[2 * (i - n) + 1] = nums[i];
        } 
        return result;
    }
}