class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) 
    {
       int n=colors.length;
		
		int count=0;
        int left = 0;
        int limit = n+k-1;
        
        while(left<n)
        {
        	int right= left+1;
        	
        	while(right<limit && (colors[(right-1)%n]!=colors[right%n]))
        	{
        		right++;
        	}
        	
        	if((right-left)>=k)
        	{
        		count += (right-left) - k +1;
        	}
        	
        	left=right;
        }
        
        return count;       
    }
}