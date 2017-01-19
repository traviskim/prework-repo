public class Solution {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        resultList.add(new ArrayList<Integer>());
 
	    for(int i=0; i<a.size(); i++) {
		    HashSet<ArrayList<Integer>> cs = new HashSet<ArrayList<Integer>>();
		    for(List<Integer> l : resultList){
			    for(int j=0; j<=l.size(); j++){
				    l.add(j, a.get(i));
				    ArrayList<Integer> temp = new ArrayList<Integer>(l);
				    l.remove(j);
				    cs.add(temp);
			}
		}
		resultList = new ArrayList<ArrayList<Integer>>(cs);
	}
	return resultList;
	}
}
