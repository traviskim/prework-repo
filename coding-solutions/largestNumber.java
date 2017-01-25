import java.util.Collections;
import java.util.Comparator;

public class Solution implements Comparator<String> {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
        List<String> b = new ArrayList<String>();
        for (Integer number : a) {
            String x = number.toString();
            b.add(x);
        }
        Collections.sort(b, this);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = b.size() - 1; i >= 0; i--) {
            sb.append(b.get(i));
            sum += Integer.parseInt(b.get(i));
        }
        return sum == 0 ? "0" : sb.toString();
    }

    public int compare(String a, String b) {
        String fe = a + b;
        String se = b + a;
        return (fe.compareTo(se));
	}
}
