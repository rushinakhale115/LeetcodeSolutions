public class Checkifnanditsdoubleexists {
    
        public static void main(String[] args) {
            Solution solution = new Solution();
    
            // Test case 1
            int[] arr1 = {10, 2, 5, 3};
            System.out.println("Test Case 1: " + solution.checkIfExist(arr1)); // Expected output: true
    
            // Test case 2
            int[] arr2 = {7, 1, 14, 11};
            System.out.println("Test Case 2: " + solution.checkIfExist(arr2)); // Expected output: true
    
            // Test case 3
            int[] arr3 = {3, 1, 7, 11};
            System.out.println("Test Case 3: " + solution.checkIfExist(arr3)); // Expected output: false
    
            // Test case 4
            int[] arr4 = {-2, 0, 10, -19, 4, 6, -8};
            System.out.println("Test Case 4: " + solution.checkIfExist(arr4)); // Expected output: false
    
            // Test case 5
            int[] arr5 = {0, 0};
            System.out.println("Test Case 5: " + solution.checkIfExist(arr5)); // Expected output: true
        }
}

class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
                    return true;
                }
            }
        }
        return false;   
    }
}
