package DSA.Recursion;
import java.util.*;


//LeetCode 40 problem  - Combination Sum 2
public class P19_CombinationSum2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];

        //taking the input for the array for size n
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //input for target
        int target = sc.nextInt();


        List<List<Integer>> result = combinationSum2(arr, target);

        //printing the result
        for(int i = 0; i<result.size(); i++)
        {
            System.out.println(result.get(i).toString());
        }
    }

    private static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum2(0, 0, result, new ArrayList<>(), target, candidates, candidates.length);
        return result;
    }


    private static void combinationSum2(int index, int sum, List<List<Integer>> result, List<Integer> ds, int target, int[] candidates, int n )
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
        combinationSum2(index+1, sum, result, ds, target, candidates, n);

        //pick call
        ds.add(candidates[index]);
        combinationSum2(index, sum + candidates[index], result, ds, target, candidates, n);
        ds.remove(ds.size() -1);
    }




}
