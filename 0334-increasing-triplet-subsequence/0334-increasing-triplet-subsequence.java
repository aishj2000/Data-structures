class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <=2)
            return false;
        int maxi = Integer.MAX_VALUE;
        int maxi1 = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=maxi)maxi = nums[i];
            else if(nums[i]<=maxi1)maxi1 = nums[i];
            else return true;
            
        }
        return false;
        
    }
}