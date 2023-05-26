package HWGroupExercise2;

public class Palindrome2 {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
