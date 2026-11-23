class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!treeMap.containsKey(nums[i]))
                treeMap.put(nums[i], 1);
            else
                treeMap.put(nums[i], treeMap.get(nums[i]) + 1);
        }

        for(int i = 0; i < k; i++){
            int key = 0;
            int val = Integer.MIN_VALUE;

            for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()){
                if(entry.getValue() > val){
                    key = entry.getKey();
                    val = entry.getValue();
                }
            }
            res[i] = key;
            treeMap.remove(key);
        }
        return res;
    }
}
