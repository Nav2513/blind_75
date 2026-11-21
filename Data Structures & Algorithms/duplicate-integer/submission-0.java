class Solution {
    public boolean hasDuplicate(int[] nums) {
         HashSet<Integer> hs = new HashSet<Integer>();

        for(int n : nums){
            hs.add(n);
        }       
        if(hs.size() < nums.length){
            return true;
        }

        return false;
    }
}