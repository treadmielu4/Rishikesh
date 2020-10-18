package practice;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="The quick brown fox jumps over the lazy dog.";
		
		char charArr[] =str.toCharArray();
		
		System.out.println("character array");
		for(int i=0;i<charArr.length;i++) {
			System.out.print(charArr[i]);
		}
		
		

	}

}
