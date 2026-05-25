func hasDuplicate(nums []int) bool {
    arrayLen := len(nums);
    for i := 0; i < arrayLen;i++{
        for j := i+1;j<arrayLen;j++{
            if(nums[i]==nums[j]){
                return true;
            }
        }
    }
            return false;

}
