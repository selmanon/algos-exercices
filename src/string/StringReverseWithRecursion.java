package string;

public class StringReverseWithRecursion {
    public static void main(String[] args) {

        System.out.println(revert("tsccsx"));
    }

    static String revert(String input){
        if(input.length() <= 1) return input;
        return revert(input.substring(1)) + input.charAt(0);
    }
}

