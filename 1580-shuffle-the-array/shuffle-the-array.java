class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] ans = new int[l];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++]=nums[i];
            ans[k++]=nums[i+n];
        }
        return ans;
    }
}