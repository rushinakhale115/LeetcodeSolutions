class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            if(arr[mid]<arr[right]){
                right=mid;
            }

        }
        return arr[left];
    }
}