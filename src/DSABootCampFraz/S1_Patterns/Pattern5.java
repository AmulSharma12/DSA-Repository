package DSABootCampFraz.S1_Patterns;
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        pattern5(5);
    }

    static void pattern5(int num){
        //Step 1 - OuterLoop = number of times row printed
        for(int row = 0; row<2*num-1; row++)
        {
            int totalColsInRows = row > num ? 2*num - row: row;
            //Step2 - InnerLoop = for every row how many times column will run  - Try to build formula relate row and col
            for(int col = 0; col < totalColsInRows; col++)
            {
                //Step3 - What do we need to print
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
