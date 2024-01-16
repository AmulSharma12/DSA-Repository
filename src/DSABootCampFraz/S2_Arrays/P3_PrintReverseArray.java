package DSABootCampFraz.S2_Arrays;
import java.util.Scanner;

public class P3_PrintReverseArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //taking input of array of size n
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }


        //printing in the reverse order - order for the following case
        for(int i = n-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }

}
