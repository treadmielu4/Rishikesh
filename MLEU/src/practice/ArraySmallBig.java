package practice;

import java.util.Scanner;

public class ArraySmallBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max=num[0];
		
		for (int i = 0; i < num.length; i++) {

			if(max<num[i]) {
				max=num[i];
			}
		}

		System.out.println("Maximum : "+max);
	}

}
