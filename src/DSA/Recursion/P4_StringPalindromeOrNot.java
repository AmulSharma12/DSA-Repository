package DSA.Recursion;
import java.util.Scanner;

public class P4_StringPalindromeOrNot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = isPalindromeOrNot(str,0, str.length());
        System.out.println(isPalindrome);
    }

    //recursive function for checking if the string is palindrome or not
    private static boolean isPalindromeOrNot(String str, int ind, int length)
    {
        //base case
        if(ind == length/2)
            return true;
        if(str.charAt(ind) != str.charAt(length - ind - 1))
            return false;
        return isPalindromeOrNot(str, ind + 1, length);
    }
}
