class Solution {
    final int M = 1000000007;
	
	public int lengthAfterTransformations(String s, int t) 
    {
		int freq[] = new int[26];
		
		for(char c: s.toCharArray())
		{
			freq[c-'a']++;
		}		
		
		while(t-- > 0)
		{
			int temp[] = new int[26];
			
			for(int i=0;i<26;i++)
			{
				int val = freq[i];
				
				if(val==0) continue; 
				
				if(i<25)
				{
					temp[i+1]=(temp[i+1]+val)%M; 
				}
				
				else
				{
					temp[0]=(temp[0]+val)%M;
					temp[1]=(temp[1]+val)%M;
				}
			}
			
			freq = temp;
		}

        int count=0;
				
		for(int i: freq)
		{
			count=(count+i)%M;
		}
        
        return count;
    }
}