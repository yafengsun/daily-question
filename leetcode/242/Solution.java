class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() >= t.length()){
             String temp = s;
            s = t;
            t = temp;

        }else{
           
        }
        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i ++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i]) + 1);
            }else{
                map.put(chars[i], 1);
            }
        }

        char[] charst = t.toCharArray();

        for(int i = 0; i < charst.length; i ++){
            if(map.containsKey(charst[i]) && map.get(charst[i]) > 0){
                map.put(charst[i], map.get(charst[i]) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}