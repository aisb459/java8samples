package streams;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        //Given the list of integers, find the first element of the list using Stream functions
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        integerList
                .stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
