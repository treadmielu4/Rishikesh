package practice;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num[]=new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}

		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		
	}

}
