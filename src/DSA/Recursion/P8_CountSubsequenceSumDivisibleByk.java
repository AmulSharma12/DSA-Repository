package DSA.Recursion;
import java.util.Scanner;
import java.util.*;

public class P8_CountSubsequenceSumDivisibleByk {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3};
        int k = sc.nextInt();
        int totalCountSubsequenceSumDivisibleByk = CountSubsequenceSumDivisibleByk(0,0,arr,arr.length,k);
        System.out.println(totalCountSubsequenceSumDivisibleByk);
    }


    //CountSubsequenceSumDivisibleByk - returns the count of total subsequences that have sum divisible by k
    private static int CountSubsequenceSumDivisibleByk(int ind,int sum,int[] nums, int size,int k)
    {
        //base case
        if(ind == size)
        {
            if(sum%k == 0)
                return 1;
            return 0;
        }
        //not pick call
        int l = CountSubsequenceSumDivisibleByk(ind+1, sum, nums,size,k);


        //pick call
        int r = CountSubsequenceSumDivisibleByk(ind+1,sum+nums[ind], nums,size,k);

        //total summation of count of both pick and not pick recursion call
        return l + r;
    }
}
