/*
*Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
*n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
*Find two lines, which together with x-axis forms a container, such that the container contains the most water.
*/
public class Solution {
    public int maxArea(int[] height) {
        if(height.length==0||height.length==1)
            return 0;
        int left=height[0];
        int right=height[height.length-1];
        int i=0,j=height.length-1;
        int maxA=(j-i)*Math.min(left,right);
        while(i<j)
        {
            //System.out.println(i+" "+j);
            if(left<=right)
            {
                i++;
                left=height[i];
            }
            else if(left>right)
            {
                j--;
                right=height[j];
            }
            maxA=maxA<(j-i)*Math.min(left,right)?(j-i)*Math.min(left,right):maxA;
        }
        return maxA;
    }
}
