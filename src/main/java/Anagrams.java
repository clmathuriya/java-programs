
public class Anagrams {

	public static void main(String[] args) {
		String s = "dad can add value to life";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (isAnagrams(a[i], a[j])) {
					System.out.println(a[i] + " " + a[j]);

				}
			}
		}

	}

	private static boolean isAnagrams(String s1, String s2) {
		for (char c : s1.toCharArray()) {
			if (s2.contains(c + "")) {
				s2 = s2.replaceFirst(c + "", "");
			} else {
				return false;
			}
		}
		if (s2.length() > 0)
			return false;

		return true;
	}

}
