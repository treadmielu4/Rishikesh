package practice;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println("For Loop:");
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"x"+i+"="+(n*i));
			
		}
		
		System.out.println();
		System.out.println("While:");
		System.out.println();
		
		int num=1;
		while(num<=10) {
			
			System.out.println(n+"x"+num+"="+(n*num));
			num+=1;
		}
		
		System.out.println();
		System.out.println("Do while:");
		System.out.println();
		
		num=1;
		do{
			
			System.out.println(n+"x"+num+"="+(n*num));
			num+=1;
		}while (num<=10);
		
	}

}
