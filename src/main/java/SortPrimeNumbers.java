import java.util.Arrays;

public class SortPrimeNumbers {

	public static void main(String[] args) {

		int a[] = { 1, 37, 4, 5, 29, 11, 22, 25, };
		boolean primeindexes[] = new boolean[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				primeindexes[i] = true;
				count++;
			}
		}
		int p[] = new int[count];
		int k = 0;
		for (int j = 0; j < a.length; j++) {
			if (primeindexes[j]) {
				p[k++] = a[j];
			}
		}
		Arrays.sort(p);
		k = 0;
		for (int j = 0; j < a.length; j++) {
			if (primeindexes[j]) {
				a[j] = p[k++];
			}
		}
		for(int i:a)
		System.out.println(i);
	}

	private static boolean isPrime(int a) {

		for (int i = 2; i * i <= a; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}
