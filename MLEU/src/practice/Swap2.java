package practice;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("value of a :"+a);
		System.out.println("value of b :"+b);

	}

}
