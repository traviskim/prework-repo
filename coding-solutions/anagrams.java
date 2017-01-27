public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    HashMap<String, ArrayList<Integer>> hm = new HashMap<String, ArrayList<Integer>>();
	    
	    for(int i=0; i<a.size(); i++){
	        char[] c = a.get(i).toCharArray();
	        Arrays.sort(c);
	        String s = String.valueOf(c);
	        if(hm.get(s) == null){
	            ArrayList<Integer> r = new ArrayList<Integer>();
	            r.add(i+1);
	            hm.put(s, r);
	        }else{
	            hm.get(s).add(i+1);
	        }
	    }
	    for(ArrayList<Integer> r: hm.values()){
	        result.add(r);
	    }
	    return result;
	}
}
