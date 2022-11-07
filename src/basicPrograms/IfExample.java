package basicPrograms;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your age : ");
	int age = scanner.nextInt();
	scanner.close();
	if(age >= 18){
	System.out.println("You are allowed to enter!!");	
} else {
	System.out.println("You are not allowed to enter!!");
}

}
}