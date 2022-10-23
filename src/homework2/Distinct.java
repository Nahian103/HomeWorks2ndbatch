package homework2;

public class Distinct {

	public static void distinctNumbers(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean isUnique = false;

			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isUnique = true;
					break;
				}
			}
			if (isUnique) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 10, 9, 2, 45, 2, 10, 10, 45 };
		distinctNumbers(arr);
	}

}
