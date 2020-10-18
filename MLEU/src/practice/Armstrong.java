package practice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n;
		int nw=0;
		int r=0;
		while(temp!=0) {
			
			r=temp%10;
			nw=nw+r*r*r;
			temp=temp/10;
		}
		
		if(nw==n) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}
