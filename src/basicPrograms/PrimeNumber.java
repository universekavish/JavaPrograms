package basicPrograms;

import java.lang.Math;
import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrime(int n) {
		if(n == 0 || n == 1){
			return false;
		} else {
			for(int i = 2; i < Math.sqrt(n); i++) {
				if(n % i == 0) {
					break;
				} else {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter number to check prime....");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(isPrime(n)) {
			System.out.println(n + " is Prime!!");
		} else {
			System.out.println(n + " is NOT PRIME!!!");
		}
	}
}
