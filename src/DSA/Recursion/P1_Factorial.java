package DSA.Recursion;
import java.util.Scanner;



public class P1_Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //calling the factorial function
        int factorial = fact2(num);
        System.out.println(factorial);
    }

    //Brute Force method
    private static int fact(int num)
    {
        int fact = 1;

        for(int i = 1; i<=num; i++)
        {
            fact *= i;
        }

        return fact;
    }



    //Approach 2 - Using Recursion
    private static int fact2(int num)
    {
        //Base case
        if(num == 1)
            return 1;


        //recursion call
        num = num * fact2(num - 1) ;


        //returning the result
        return num;
    }
}
