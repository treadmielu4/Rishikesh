package practice;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="The quick brown fox jumps over the lazy dog.";
		
		String str1=str.replace("d", "f");
		
		System.out.println(str1);

		String str2=str.replaceAll("fox", "cat");
		
		System.out.println(str2);
		
	}

}
