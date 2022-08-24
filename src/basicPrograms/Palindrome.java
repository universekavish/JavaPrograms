package basicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Enter Number/String to check palindrome!!");
		Scanner scanner = new Scanner(System.in);
		original = scanner.nextLine();
		scanner.close();
		int length = original.length();
		
		for(int i = length - 1; i >=0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		if(original.equals(reverse)) {
			System.out.println(original + " is Palindrome!!");
		} else {
			System.out.println(original + " is not Palindrome!!");
		}
		
		
	}

}
