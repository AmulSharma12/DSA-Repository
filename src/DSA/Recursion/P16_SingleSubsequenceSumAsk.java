package DSA.Recursion;
import java.util.*;
public class P16_SingleSubsequenceSumAsk {
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

        //Printing single subsequence with sum as k
        printSingleSubsequenceSumAsK(0, new ArrayList<>(), 0, k,arr, arr.length);

    }


    private static boolean printSingleSubsequenceSumAsK(int ind, List<Integer> list, int sum, int k, int[] nums, int n)
    {
        //base case
        if(ind == n)
        {
            if(sum == k)
            {
                //print and return with true to avoid further recursion call
                System.out.println(list.toString());
                return true;
            }
            return false;
        }

        //pick call
        list.add(nums[ind]);
        if(printSingleSubsequenceSumAsK(ind + 1, list, sum + nums[ind], k, nums, n))    return true;
        list.remove(list.size() -1);

        //not pick call
        if(printSingleSubsequenceSumAsK(ind + 1, list, sum , k, nums, n))    return true;


        //if you dont get any subset having sum equals k return false
        return false;
    }

}
