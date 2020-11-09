class Solution {
    public String sortString(String s) {
        if(s.length() == 0) return s;
        char[] arrays = s.toCharArray();
        int[] flag = new int[arrays.length];

        Arrays.sort(arrays);
     
        String str = "";
        while(str.length() != s.length()){
             Character currentMin = null;
        Character currentMax = null;
            // 选取最小的
            while(true){
                int index = findMin(arrays, currentMin, flag);
                if(index != - 1){
                    flag[index] = 1;
                    str  += arrays[index];
                    currentMin =arrays[index];
                }else{
                    currentMin = null;
                    break;
                }
            }
            
            // 选取最大的
             while(true){
                int index = findMax(arrays, currentMax, flag);
                if(index != - 1){
                    flag[index] = 1;
                    str += arrays[index];
                    currentMax = arrays[index];
                }else{
                    currentMax = null;
                    break;
                }
            }

        }
        return str;
    }

    int findMin(char[] a, Character currentMin, int[] flag){
       
            for(int i = 0; i < a.length; i ++){
                if(flag[i] == 0 && (currentMin == null || a[i] > currentMin)) return i;
            }
        
        return -1;
    }

        int findMax(char[] a, Character currentMin,int[] flag){
             for(int i = a.length - 1; i>=0; i --){
                if(flag[i] == 0 && (currentMin == null ||  a[i] < currentMin) ) return i;
            }
        
        return -1;
    }
}