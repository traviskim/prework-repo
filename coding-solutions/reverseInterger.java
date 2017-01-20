public class Solution {
	public int reverse(int a) {
	    long revInt = 0;
	    while(a != 0){
	        revInt = revInt*10 + a%10;
	        a = a/10;
	    }
	    
	    if(revInt < Integer.MIN_VALUE || revInt > Integer.MAX_VALUE){
	        return 0;
	    }else{
	        return (int)revInt;
	    }
	}
}
