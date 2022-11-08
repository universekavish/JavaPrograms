package basicPrograms;

import java.util.Scanner;

public class LeapYearExample{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year to check if Leap Year : `");
		int year = scanner.nextInt();
		scanner.close();
		if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0){
			System.out.println("Leap year");
		} else {
			System.out.println("Common Year");
		}
	}
}