class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0; 
        }
    HashSet<Integer> hs=new HashSet<Integer>();
    for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
    }
    int log=0;
    for(int num:hs){
        if(!hs.contains(num-1)){
            int curr=num;
            int len=1;
        while(hs.contains(curr+1)){
            curr++;
            len++;
        }
        log=Math.max(len,log);
    }
    }
        return log;

    }
}
