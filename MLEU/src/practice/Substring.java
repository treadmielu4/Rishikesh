package practice;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String str="The quick brown fox jumps over the lazy dog.";
		
		System.out.println("Enter starting index");
		int beginIndex=sc.nextInt();
		System.out.println("Enter ending index");
		int endIndex=sc.nextInt();
		
		System.out.println(str.substring(beginIndex, endIndex));
		

	}

}
