class Solution {
    /**MATHEMATICAL SOLUTION */
    // Map<Integer, Integer> factCache = new HashMap<>();

    // public int factorial(int i)
    // {
    //     if (i == 0) return 1;
    //    if (factCache.containsKey(i))
    //         return factCache.get(i);
    //     int result = i * factorial(i - 1);
    //     factCache.put(i, result);
    //     return result;
    // }
    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     for(int i=0;i<numRows;i++){
    //         List<Integer> sum = new ArrayList<>(); 
    //         for(int j = 0;j<=i;j++){
    //             int  value = factorial(i)/(factorial(j)*factorial(i-j));
    //         sum.add(value);
    //         }
    //         ans.add(sum);
    //     }
    //     return ans;
    /**OPTIMAL SOLUTION */
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            long value = 1;
            List<Integer> row = new ArrayList<>(); 
            for(int j = 0;j<=i;j++){

                row.add((int)value);
                value = value*(i-j)/(j+1);
           
            }
            triangle.add(row);
        }
        return triangle;
        
    }
}