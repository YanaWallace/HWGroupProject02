package HWGroupExercise2;

public class CountNumOfWords3 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int wordCount = countWords(str);
        System.out.println(wordCount);
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}
