class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>=arr[left]){
                if(target>=arr[left] && target<=arr[mid]){
                right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }else{
                if(arr[mid]<target && target<=arr[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
                
            }

            }
            return -1;
        }
        
    
}