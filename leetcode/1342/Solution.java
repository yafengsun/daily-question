class Solution {
    public int numberOfSteps (int num) {
        int result = 0;
        while(true){
            if(num == 0) return result;
            if(num % 2 == 1){
                num -= 1;
            }else{
                num /= 2;
            }
            result ++;
        }
    }
}