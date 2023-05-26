package HWGroupExercise2;

public class ReverseStr1 {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}


