package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersInList {
    public static void main(String[] args) {
        //Given a list of integers, find out all the even numbers that exist in the list using Stream functions
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        List<Integer> evenList = integerList
                .stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        evenList.forEach(System.out::println);
    }
}
