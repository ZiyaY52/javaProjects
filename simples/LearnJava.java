import java.util.*;

public class LearnJava {

	public static String StringReturner(String str) {
		char ch;
		String s="";
		
		if(str.length()%2==1) {
			ch=str.charAt(str.length()/2);
			s= s+ch;
			
		}
		
		else {
			ch=str.charAt(str.length()/2-1);
			s=s+ch;
			ch=str.charAt(str.length()/2);
			s=s+ch;
			
		}
		
		return s;
		
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String abc;
		System.out.println("Enter a word");
		abc = input.nextLine();
		System.out.println("The middle of the string is " +StringReturner(abc));
	
		 
  }
}