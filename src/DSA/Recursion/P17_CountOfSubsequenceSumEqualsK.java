package DSA.Recursion;
import java.util.*;
public class P17_CountOfSubsequenceSumEqualsK {
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
        int totalCount = countOfSubsequenceSumEqualsK(0, new ArrayList<>(), 0, k,arr, arr.length);
        System.out.println(totalCount);
    }


    private static int countOfSubsequenceSumEqualsK(int ind, List<Integer> list, int sum, int k, int[] nums, int n)
    {
        //base case
        if(ind == n)
        {
            if(sum == k)
                return 1;
            return 0;
        }

        //pick call
        list.add(nums[ind]);
        int pickCount = countOfSubsequenceSumEqualsK(ind + 1, list, sum + nums[ind], k, nums, n);
        list.remove(list.size() -1);

        //not pick call
        int notPickCount = countOfSubsequenceSumEqualsK(ind + 1, list, sum , k, nums, n);


        //returning the total count i.e. pickCount and notPickCount
        return pickCount + notPickCount;
    }

}
