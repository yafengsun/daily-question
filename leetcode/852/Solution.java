class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // 左大右小  右移动
        // 左小右大  左移动
        // 左大右大  返回
        int left = 0;
        int right = arr.length - 1;
        while(true){
            int mid = (right + left ) / 2;
            boolean flagLeft = true,
            flagRight = true;
            if(mid - 1 >= 0){
                if(arr[mid] > arr[mid - 1]){
                    flagLeft = true;
                }else{
                    flagLeft = false;
                }
            }
            if(mid + 1 < arr.length){
                if(arr[mid] > arr[mid + 1]){
                    flagRight = true;
                }else{
                    flagRight = false;
                }
            }
            if(flagRight && flagLeft){
                return mid;
            }else if((!flagLeft) && flagRight){
                right = mid - 1;
            }else{
                 left = mid + 1;
               
            }
        }
    }
}