package DSA.Recursion;
import java.util.*;


//LeetCode 39 problem - Combination Sum
public class P18_CombinationSum1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        List<List<Integer>> result = combinationSum(arr, target);

        //printing the result
        for(int i = 0; i<result.size(); i++)
        {
            System.out.println(result.get(i).toString());
        }
    }

    private static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(0, 0, result, new ArrayList<>(), target, candidates, candidates.length);
        return result;
    }


    private static void combinationSum(int index, int sum, List<List<Integer>> result, List<Integer> ds, int target, int[] candidates, int n )
    {
        if(sum > target)
            return;
        //base case
        if(index == n){
            if(sum == target){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        //not pick call
        combinationSum(index+1, sum, result, ds, target, candidates, n);

        //pick call
        ds.add(candidates[index]);
        combinationSum(index, sum + candidates[index], result, ds, target, candidates, n);
        ds.remove(ds.size() -1);
    }




}
