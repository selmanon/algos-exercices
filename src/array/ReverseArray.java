package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6};
        for(int i = 0; i < data.length / 2 ; i++) {
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(data));
    }
}
