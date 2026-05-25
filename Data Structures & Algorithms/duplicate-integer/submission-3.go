func hasDuplicate(nums []int) bool {
    seen := make(map[int]bool)
    arrLen := len(nums)
    for i:=0;i<arrLen;i++ {
        if(seen[nums[i]]){
            return true;
        }
        seen[nums[i]]=true;
    }
    return false;
}
