package jsd3;

public class Assignment14 {
    //14.	Store 5 integers in an array and print in reverse order.
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Printing Array in Reverse Order ");
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
