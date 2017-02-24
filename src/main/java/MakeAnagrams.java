import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAnagrams {
	public static int numberNeeded(String first, String second) {
		int ans = 0;
		Map<Character, Integer> map = new HashMap();
		for (char c : first.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		for (char c : second.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			} else {
				map.put(c, -1);
			}

		}
		for (int i : map.values()) {
			ans += Math.abs(i);
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
