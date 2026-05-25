class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int n=heights.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int min=Math.min(heights[i],heights[j]);
            int res1=min*(j-i);
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
            maxWater=Math.max(res1,maxWater);
        }
        return maxWater;
    }
}
