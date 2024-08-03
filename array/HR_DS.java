import java.util.Collections;

public class Solution {
	public static List<Integer> reverseArray(List<Integer> a) {
        	int i, temp, len = a.size();
        	for (i = 0; i < len / 2; i++) {
            		temp = a.get(i);
            		a.set(i, a.get(len - 1 - i));
            		a.set(len - 1 - i, temp);
        	}
        	return a;
    	}
}