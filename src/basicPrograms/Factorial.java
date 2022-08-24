package basicPrograms;

import java.util.Scanner;

public class Factorial {
	
	static int calcFact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n*calcFact(n-1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number to calculate it's factorial: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("Factorial of " + number + " is " + calcFact(number));
	}
}
