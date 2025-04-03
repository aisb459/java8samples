package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CheckIfListNull {
    public static void main(String[] args) {
        //How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object
        List<String> stringList = Arrays.asList("java","docs","are");
        Optional.ofNullable(stringList).ifPresent(x->System.out.println(x));
    }
}
