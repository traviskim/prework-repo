public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for(int i=0; i<a.size(); i++){
	        if(hm.containsKey(a.get(i))){
	            result.add(0, hm.get(a.get(i)));
	            result.add(1, i+1);
	            break;
	        }else{
	            if(!hm.containsKey(b-a.get(i))){
	                hm.put(b - a.get(i), i+1);
	            }
	        }
	    }
	    return result;
	}
}
