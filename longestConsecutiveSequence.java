public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    if (a.size() == 0) {
	    	return 0;
	    }
 
	    HashSet<Integer> hs = new HashSet<Integer>();
	    int max = 1;
 
	    for(int number:a){
	    	hs.add(number);
	    }
 
    	for (int number : a) {
    		int left = number - 1;
    		int right = number + 1;
    		int count = 1;
 
    		while(hs.contains(left)){
    			hs.remove(left);
    			count++;
    			left--;
    		}
 
	    	while(hs.contains(right)){
	    		hs.remove(right);
	    		count++;
	    		right++;
	    	}
 
	    	max = Math.max(count, max);
    	}
    	return max;
	}
}
