package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class SortListOfInt {
    public static void main(String[] args) {
        //Given a list of integers, sort all the values present in it using Stream functions
        List<Integer> integerList = Arrays.asList(1,15,2,1,5,2);
        integerList
                .stream()
                .sorted((x,y)->Integer.compare(x,y))
                .forEach(System.out::println);
        System.out.println("***************************************");
        // Given a list of integers, sort all the values present in it in descending order using Stream functions
        integerList
                .stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
