class Solution {
    public String thousandSeparator(int n) {
        String str = n + "";
        String result = "";
        for(int i = str.length(); i >= 0; ){
            if(i > 3){
                // 每三位分割一次
                result =  "." + str.substring(i - 3,i) + result;
                i = i - 3;
            }else{
                // 不足三位直接加然后返回
                result = str.substring(0, i) + result;
                  
                i = -1;
            }
        }
        return result;
    }
}