package string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
        if (isAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }


    static boolean isAnagram(char[] char1, char[] char2) {
        if (char1.length != char2.length) return false;

        Arrays.sort(char1);
        Arrays.sort(char2);

        for(int i = 0; i < char1.length ; i++) {
            if(char1[i] != char2[i]) return false;
        }

        return true;
    }
}

