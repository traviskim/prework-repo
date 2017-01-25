public class Solution {
	public void arrange(ArrayList<Integer> a) {
        int len = a.size();
        for (int i = 0; i < len; i++) {
            int num = a.get(i);
            int b = num;
            int c = a.get(num);
            if (c >= len) {
                c = a.get(num) % len;
            }
            int encode = b + c * len;
            a.set(i, encode);
        }
        for (int i = 0; i < len; i++) {
            a.set(i, a.get(i) / len);
        }
	}
}
