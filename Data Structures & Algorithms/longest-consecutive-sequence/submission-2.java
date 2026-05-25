class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int maxCount=1;
        int i =0;
        int j=1;
        while(j < nums.length)

        {
            if(nums[j]==nums[i]){
                i++;
                j++;
                continue;
            }
           if(nums[j] - nums[i] == 1) {
            count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }

            i++;
            j++;
        }
        return Math.max(maxCount, count);
    }
}
