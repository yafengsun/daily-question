class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // 代表arr2的顺序以及arr1中的数量
        int[] arr3 = new int[1001];
        int[] result = new int[arr1.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr2.length; i ++){
            map.put(arr2[i], i);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr1.length; i ++){
            if(map.containsKey(arr1[i])){
                arr3[map.get(arr1[i])] ++;
            }else{
                list.add(arr1[i]);
            }
        }

        // 双重for循环
        int sum = 0;
        for(int i = 0; i < arr3.length && arr3[i] > 0; i ++){
            for(int j = 0; j < arr3[i]; j ++){
                result[sum] = arr2[i];
                sum ++;
            }
        }

        list.sort(Integer::compare);
        for(int i = sum; i < result.length; i ++){
            result[i] = list.get( i - sum);
        }

        return result;
        
    }
}