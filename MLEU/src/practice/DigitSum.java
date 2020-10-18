package practice;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int digit=sc.nextInt();
		int sum=0;
		while(digit!=0) {
			
	
			sum+=digit%10;
			digit=digit/10;
		}

		System.out.println("Sum of digits : "+sum);
	}

}
