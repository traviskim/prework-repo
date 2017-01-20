public class Solution {
	public int titleToNumber(String a) {
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
	}
}
