class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;int right=height.length-1;
       while(left<right){
        int leftH=height[left];
        int rightH=height[right];
        int h=Math.min(leftH,rightH);
        int area=h*(right-left);
        if(area>maxarea){
            maxarea=area;
        }
        if(leftH<rightH){
            left++;
        }else{
            right--;
        }

       }
        return maxarea;
    }
}