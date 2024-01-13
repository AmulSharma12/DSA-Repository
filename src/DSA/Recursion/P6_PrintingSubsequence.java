package DSA.Recursion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Subsequence pick or not pick pattern for a particular index either we pick or not pick the element

public class P6_PrintingSubsequence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3};
        List<Integer> list = new ArrayList<Integer>();

        //function call printingSubsequence
        printingSubsequences(arr,0,list,arr.length);
    }


    private static void printingSubsequences(int[] nums, int ind, List<Integer> list, int size)
    {
        //base case
        if(ind == size)
        {
            //print and return
            System.out.println(list.toString());
            return;
        }

        //pick the element recursion call
        list.add(nums[ind]);
        printingSubsequences(nums,ind+1,list,size);
        list.remove(list.size() -1);

        //non-pick recursion call in both case we move to the next index
        printingSubsequences(nums,ind+1,list,size);
    }


}
