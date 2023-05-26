package HWGroupExercise2;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar5 {
    public static void main(String[] args) {
        String str = "abracadabra";
        char firstNonRepeatingChar = findFirstNonRepeatingCharacter(str);
        System.out.println(firstNonRepeatingChar);
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = charCounts.getOrDefault(c, 0);
            charCounts.put(c, count + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }

    }
