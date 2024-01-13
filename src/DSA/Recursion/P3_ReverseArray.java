package DSA.Recursion;
import java.util.Scanner;

public class P3_ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3,4,5};

        //function call
        reverseArrayUsingRecursion(arr,0,arr.length);

        //looping in array and printing the value
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }

    }

    //reverseArrayUsingRecursion function - to reverse the array
    private static void reverseArrayUsingRecursion(int[] arr, int ind, int size)
    {
        if(ind > size/2)
            return;

        //swap the index with the corresponding indexes
        swap(arr, ind, size - ind - 1);
        reverseArrayUsingRecursion(arr, ind+1, size);

    }

    //swap function to swap the element present in array using indexes
    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
