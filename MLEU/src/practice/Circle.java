package practice;

import java.util.Scanner;

public class Circle {
	
	static double pi=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		
		double perimeter=2*pi*radius;
		double area=pi*radius*radius;
		
		System.out.println("Perimeter of circle :"+perimeter);
		System.out.println("Area of circle : "+area);

	}

}
