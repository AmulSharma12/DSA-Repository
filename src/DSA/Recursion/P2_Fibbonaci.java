package DSA.Recursion;
import java.util.Scanner;


public class P2_Fibbonaci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int fibbonaci = fib(num);
        System.out.println(fibbonaci);
    }


    //using recursion approach
    private static int fib(int num)
    {
        //base case
        if(num <= 1)
            return num;

        return fib(num - 1) + fib(num - 2);
    }
}
