package DSA.Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P7_PrintSubsequenceSumDivisibleByk {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3};
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        //function call printingSubsequenceSumDivisibleByK
        printSubsequenceSumDivisibleByk(0,0,list,arr,arr.length,k);
    }


    private static void printSubsequenceSumDivisibleByk(int ind, int sum,List<Integer> list,int[] nums, int size, int k)
    {
        //base case
        if(ind == size)
        {
            if(sum%k==0){
                System.out.println(list.toString());
            }
            return;
        }



        //pick call
        sum += nums[ind];
        list.add(nums[ind]);
        printSubsequenceSumDivisibleByk(ind+1,sum,list,nums, size, k);
        list.remove(list.size() -1);
        sum -= nums[ind];


        //not pick call
        printSubsequenceSumDivisibleByk(ind+1,sum,list, nums,size,k);
    }

}
