package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n;
		int nw=0;
		
		while(temp!=0) {
			
			nw=10*nw+temp%10;
			temp=temp/10;
			
		}

		if(n==nw) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
