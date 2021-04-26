package Recursive;

public class SumTailRecursive {
	public static void main(String[] args) {

		int sum = sumRecursive(10);

		System.out.println(sum); // 55

		sum = sumRecursive(100);

		System.out.println(sum); // 5050

		sum = sumRecursive(1000);

		System.out.println(sum); // 500500

		sum = sumRecursive(100000); // ??

		System.out.println(sum);
	}

	private static int sumRecursive(int n) {
		if (n <= 1) {
			return n;
		}

		int temp = sumRecursive(n - 1);

		return n + temp;
	}
}
