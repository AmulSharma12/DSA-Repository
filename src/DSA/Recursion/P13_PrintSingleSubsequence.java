package DSA.Recursion;
import java.util.*;

//Problem 13 - Printing single subsequence whose sum is divisible by k
public class P13_PrintSingleSubsequence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4};
        List<Integer> list = new ArrayList<>();
        int k = sc.nextInt();
        boolean result = printSingleSubsequence(0,list, 0, arr,arr.length, k);
        System.out.println(result);
    }

    //printingSingleSubsequence  - printing single subsequence
    private static boolean printSingleSubsequence(int ind, List<Integer> list, int sum, int[] nums, int size, int k)
    {
        //From base case we wil stop when we meet the condition satisfied
        if(ind == size)
        {
            //condition sum is divisible by k
            if(sum % k == 0)
            {
                //printing the subsequence and returning true
                System.out.println(list.toString());
                return true;
            }

            //if not meet the condition - return  false
            return false;
        }


        //recursion calls for pick and not pick case

        //pick recursion call
        list.add(nums[ind]);
        sum += nums[ind];

        //As we need to print the single subsequence in case of we found the subsequence we should return true same for non
        //pick case
        if(printSingleSubsequence(ind+1, list,sum,nums, size,k) )   return true;
        sum -= nums[ind];
        list.remove(list.size() - 1);


        //not pick recursion call
        if(printSingleSubsequence(ind+1,list, sum ,nums,size,k)) return true;


        return false;
    }
}
