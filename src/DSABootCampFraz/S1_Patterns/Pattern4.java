package DSABootCampFraz.S1_Patterns;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        pattern4(4);
    }


    static void pattern4(int num)
    {
        //Step 1 - OuterLoop = number of times row printed
        for(int row = 1; row<=num; row++)
        {
            //Step2 - InnerLoop = for every row how many times column will run  - Try to build formula relate row and col
            for(int col = 1; col <= row; col++)
            {
                //Step3 - What do we need to print
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
