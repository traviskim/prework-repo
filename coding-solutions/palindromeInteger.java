public class Solution {
	public boolean isPalindrome(int a) {
	    if(a<0){
	        return false;
	    }
	    int div = 1;
	    while(a/div >= 10){
	        div = div * 10;
	    }
	    
		while (a != 0) {
			int left = a / div;
			int right = a % 10;
 
			if (left != right){
				return false;
			}
 
			a = (a % div) / 10;
			div = div / 100;
		}
 
		return true;
	}
}
