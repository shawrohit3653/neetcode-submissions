class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int secondNumber=target-nums[i];
           if(hm.containsKey(secondNumber)){
            return new int[] {hm.get(secondNumber),i};
           }
           hm.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}
