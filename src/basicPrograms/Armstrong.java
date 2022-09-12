package basicPrograms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter number to check: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		
		int length = input.length();
		
		int sum = 0;
		for(int i = 0; i <= length; i++) {
			sum += Integer.parseInt(input.charAt(i));
		}
		
		System.out.println(sum);

	}

}
