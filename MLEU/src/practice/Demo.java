package practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int arr[] = { 1, 5, 5, 2, 2, 7, 8, 6, 6, 9, 10 };

		int j = 1;
		for (int i = 0; i < arr.length - 1; i++) {

			if ((arr[i] % 2 == 0) && (arr[i] == arr[j])) {
				count++;
			}
			j++;
		}
		System.out.println(count);
	}

}
