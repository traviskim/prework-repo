public class Solution {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(a <= 0){
	        return result;
	    }
	    int size = (a*2)-1;
	    int[][] matrix = new int[size][size];
	    
	    //Update matrix from outter to inner
	    int value = a;
	    int right = size-1;
	    int bottom = size-1;
	    int left = 0;
	    int top = 0;
	    int i=0;
	    int j=0;
	    
	    while(left <= right && top <= bottom){
	        //move to right
	        for(int k=left; k<=right; k++){
	            matrix[i][j] = value;
	            j++;
	        }
	        j = right;
	        right--;
	        
	        //move to bottom
	        for(int l=top; l<=bottom; l++){
	            matrix[i][j] = value;
	            i++;
	        }
	        i = bottom;
	        top++;
	        
	        //move to left
	        for(int m=right; m>=left; m--){
	            matrix[i][j] = value;
	            j--;
	        }
	        j = left;
	        left++;
	        
	        //move to top
	        for(int n=bottom; n>=top; n--){
	            matrix[i][j] = value;
	            i--;
	        }
	        i = top;
	        j++;
	        bottom--;
	        value--;
	    }
	    
	    for(int p=0; p<size; p++){
	        ArrayList<Integer> line = new ArrayList<Integer>();
	        for(int q=0; q<size; q++){
	            line.add(matrix[p][q]);
	        }
	        result.add(line);
	    }
	    return result;
	}
}
