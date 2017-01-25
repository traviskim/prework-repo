public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(a<1){
            return result;
        }
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        for(int i=0; i<a-1; i++) {
            ArrayList<Integer> rowList = new ArrayList<Integer>();
            rowList.add(1);
            int lastRowSize = result.get(i).size();
            for(int j=1; j<lastRowSize; j++) {
                rowList.add(result.get(i).get(j) + result.get(i).get(j - 1));
            }
            rowList.add(1);
            result.add(rowList);
        }
        return result;
    }
}
