
// Time Complexity : O()
// Space Complexity : O()
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int cnt = 1;
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev){
                cnt++;
            }else{
                prev = nums[i];
                cnt = 1;
            }
            if(cnt >= 3){
                nums[i] = Integer.MAX_VALUE;
                ans++;
            }
        }
        Arrays.sort(nums);
        return nums.length - ans;
    }
}
