package DSA.Recursion;
import java.util.Scanner;

//binary search is the searching algorithim used to search the element in O(LogN) time complexity by calculating the
//mid and reducing the search space
public class P5_BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {1,2,3,4,5};

        //target input taken
        int target = sc.nextInt();

        //function call to binarySearch
        boolean isFound = binarySearch(arr,0,arr.length-1, target);
        System.out.println(isFound);
    }


    //binary Search using recursion
    private static boolean binarySearch(int[] nums, int start, int end, int target)
    {
        //Invalid case  - base case - when both the pointer cross each other and there is no more element to be searched
        if(start > end)
            return false;

        //calculating mid to find the element
        int mid = start +  (end-start)/2;

        //when you found the element then return with true
        if(nums[mid] == target)
            return true;

        // when target is smaller than mid element
        if(target < nums[mid])
            return binarySearch(nums, start, mid -1, target);

        //when target is greater than the mid element
        return binarySearch(nums, mid + 1, end, target);

    }

}
