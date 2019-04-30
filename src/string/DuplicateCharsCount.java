package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsCount {

    public static void main(String[] args) {
        printDuplicateCharsCount("Programming");
        System.out.println();
        printDuplicateCharsCount("Combination");
        System.out.println();
        printDuplicateCharsCount("Java");
    }


    static void printDuplicateCharsCount(String input) {
        char[] chars = input.toCharArray();

        HashMap<Character, Integer> charMapCounter = new HashMap<>();

        for (char c : chars) {
            if(charMapCounter.containsKey(c)){
                charMapCounter.put(c, charMapCounter.get(c) + 1);
            } else {
                charMapCounter.put(c, 1);
            }
        }

        // printing
        for(Map.Entry<Character, Integer> entry: charMapCounter.entrySet()){
            System.out.printf("%s : %d %n" , entry.getKey(), entry.getValue());
        }
    }
}

