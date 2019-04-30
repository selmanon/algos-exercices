package string;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstNonRepeatedChar {
    public static void main(String[] args) {
        System.out.println(printFirstNonRepeatedChar("aabbccaaddsddff"));

    }

    static char printFirstNonRepeatedChar(String word) {
        List<Character> repeating = new ArrayList<>();
        List<Character> nonRepeating = new ArrayList<>();

        nonRepeating.add(word.toCharArray()[0]);
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }

            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }
}
