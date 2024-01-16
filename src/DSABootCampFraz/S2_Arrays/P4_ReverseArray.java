package DSABootCampFraz.S2_Arrays;
import java.util.Scanner;
public class P4_ReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //taking the input for the array of size n
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }



        //reversing the array of size n
        for(int i = 0; i<n/2; i++)
        {
            swap(arr, i, n-i-1);
        }


        //printing the array of size - n
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }


    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
