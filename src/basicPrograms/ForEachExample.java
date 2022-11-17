package basicPrograms;

public class ForEachExample{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 6, 8, 9, 10};
        // declaring a sized 10 array, won't be needing it, for practice only
        // int[] squareArr = new int[10];
        for(int i : arr){
            System.out.println(i +  " " + i*i);
        }
    }
}