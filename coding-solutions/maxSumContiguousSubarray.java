public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int currMax = Integer.MIN_VALUE;
	    int nextMax = 0;
	    for(int i=0; i<a.size(); i++){
	        nextMax = nextMax + a.get(i);
	        if(currMax < nextMax){
	            currMax = nextMax;
	        }
	        if(nextMax < 0){
	            nextMax = 0;
	        }
	    }
	    return currMax;
	}
}
