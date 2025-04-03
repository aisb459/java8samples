package streams;

import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        //Program to find the Maximum element in an array
        int[] intArr = {1,2,3,35,4};
        int max = Arrays.stream(intArr).max().getAsInt();
        System.out.println(max);
    }
}
