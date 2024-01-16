package DSABootCampFraz.S2_Arrays;
import java.util.*;

public class P2_MinAndSecondMin {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //take input of array for size n
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }


        //finding the first minimum from the array
        int minElement = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] < minElement)
                minElement = arr[i];
        }
        System.out.println(minElement);

        //finding the second minimum from the array
        int secondMinElement = Integer.MAX_VALUE;
        for(int i = 0;i<n; i++)
        {
            if(arr[i] == minElement)
                continue;

            if(arr[i] < secondMinElement)
                secondMinElement = arr[i];
        }
        System.out.println(secondMinElement);
    }



    private static void minAndSecondMinElementUsingSingleLoop(int[] arr, int n)
    {
         int minElement = Integer.MAX_VALUE;
         int secondMinElement = Integer.MAX_VALUE;


         //finding the minAndSecondMinElement using one for loop
         for(int i = 0; i<n; i++)
         {
             if(arr[i] < minElement) {
                    secondMinElement =  minElement;
                    minElement = arr[i];
             }
             else if(arr[i] != minElement && arr[i] < secondMinElement)
             {
                 secondMinElement = arr[i];
             }
         }
    }
}
