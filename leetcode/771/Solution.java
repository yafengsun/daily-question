class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] j = J.toCharArray();
        
        boolean[] flag = new boolean['z' + 1];

        for(int i = 0; i < j.length; i ++){
           flag[j[i]] = true; 
        }

        // 判断有多少

        char[] s = S.toCharArray();
        int sum = 0;
        for(int i = 0; i < s.length; i ++){
            if(flag[s[i]]) sum++;
        }

        return sum;
    }
}