class Solution {
    public int maxArea(int[] height) {
        int maxVolume = 0;
        int left = 0, right = height.length - 1, high = 0;

        while(left < right){
            if(height[left] < height[right])
                high = height[left];
            else
                high = height[right];
            
            int volume = (right - left) * high;

            if(height[left] < height[right])
                left++;
            else
                right--;
            
            maxVolume = Math.max(maxVolume, volume);
        }
        return maxVolume;
    }
}
