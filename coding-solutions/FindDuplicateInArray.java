public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    HashSet<Integer> hs = new HashSet<Integer>();
	    //traverse all elements
	    for(int i=0; i<a.size(); i++){
	        if(hs.contains(a.get(i))){
	            return a.get(i);
	        }else{
	            hs.add(a.get(i));
	        }
	    }
	    return -1;
	}
}
