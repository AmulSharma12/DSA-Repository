package DSA.Recursion;
import java.util.*;

public class P15_PrintSubsequenceSumAsK {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        printSubsequenceWithSumEqualsK(0,0, arr, arr.length, new ArrayList<>(), k);
    }

    //printSubsequenceWithSumEqualsK - it will print all the subsequence that has the sum equals to k
    private static void printSubsequenceWithSumEqualsK(int ind, int sum, int[] nums, int n, List<Integer> ds, int k)
    {
        //base case
        if(ind == n)
        {
            if(sum == k)
                System.out.println(ds);
            return;
        }

        //not pick call
        printSubsequenceWithSumEqualsK(ind+1, sum, nums, n, ds,k);

        //pick call
        ds.add(nums[ind]);
        printSubsequenceWithSumEqualsK(ind+1, sum+nums[ind], nums,n, ds, k);
        ds.remove(ds.size() - 1);
    }
}
