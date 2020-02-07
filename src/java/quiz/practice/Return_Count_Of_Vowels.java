package java.quiz.practice;

public class Return_Count_Of_Vowels {

	public static int getCount(String str) {
		int vowelsCount = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount += 1;
			}
		}
		return vowelsCount;
	}

	public static int find(int[] integers) {
		int oddCount = 0;
		int evenCount = 0;
		String required = null;
		int oddnumber = 0;
		for (int i : integers) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

			if (evenCount == 2) {
				required = "odd";
				break;
			}
			if (oddCount == 2) {
				required = "even";
				break;
			}

		}
		if (required.equals("even")) {
			for (int i : integers) {
				if (i % 2 == 0) {
					oddnumber = i;
				}

			}

		} else {
			for (int i : integers) {
				if (i % 2 != 0) {
					oddnumber = i;
				}
			}
		}

		return oddnumber;
	}

	public static void main(String[] args) {
//		System.out.println((getCount("abracebydi obra")));
		int arr[] = { Integer.MAX_VALUE, 0, 1 };
		System.out.println(find(arr));
	}
}
