class Solution {
    public boolean isPalindrome(String s) {
        String withOutSpace= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=withOutSpace.length() - 1;
        while(i<j){
            if(withOutSpace.charAt(i)==withOutSpace.charAt(j)){
                i++;
                j--;
            }
            else{
            return false;
            }
        }
        return true;
    }
}
