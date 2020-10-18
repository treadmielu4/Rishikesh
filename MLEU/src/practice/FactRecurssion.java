package practice;

import java.util.Scanner;

public class FactRecurssion {

	public static int fact(int n) {
		
		if(n<1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int factorial=fact(n);
		System.out.println("Factorial : "+factorial);

	}

}
