package basicPrograms;

import java.util.Scanner;

public class RightTrianglePattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = scanner.nextInt();
        scanner.close();

        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}