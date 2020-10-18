package practice;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String str="The quick brown fox jumps over the lazy dog.";
		
		System.out.println("Last index of the string str: "+(str.length()-1));
		
		System.out.println("Length of given string str: "+(str.length()));
		
		String str1="RishikeshKumar Tripathy";
		String str2="RishikeshKumar Tripathy over the lazy dog.";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("Enter the indices");
		boolean status=false;
		int beginIndex=sc.nextInt();
		int endIndex=sc.nextInt();
		
		if((str.substring(beginIndex, endIndex)).equals(str1.substring(beginIndex, endIndex))) {
			status=true;
		}
		else{
			status=false;
		}
		System.out.println("Match status of str and str1: "+status);
		
		System.out.println("Enter the indices");
		boolean status1=false;
		int beginIndex1=sc.nextInt();
		int endIndex2=sc.nextInt();
		
		if((str1.substring(beginIndex1, endIndex2)).equals(str2.substring(beginIndex1, endIndex2))) {
			status=true;
		}
		else{
			status=false;
		}
		
		
		
	}

}
