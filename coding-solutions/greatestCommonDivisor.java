public class Solution {
	public int gcd(int a, int b) {
        while(a!=0 && b!=0){
            int c = b;
            b = a%b;
            a = c;
        }
        return a+b;
	}
}
