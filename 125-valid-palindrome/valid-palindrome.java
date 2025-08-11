class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int st = 0;
        int l = s.length() - 1;
        while(st <= l) {
        	char currFirst = s.charAt(st);
        	char currLast = s.charAt(l);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		st++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		l--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		st++;
        		l--;
        	}
        }
        return true;
    }
}