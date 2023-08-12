import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInIntList {
    public static void main(String[] args) {
        //How to find duplicate elements in a given integers list in java using Stream functions
        List<Integer> integerList = Arrays.asList(12,1,12,13,1,15,17);
        integerList
                .stream()
                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()==2)
                .forEach(x->System.out.println(x.getKey()));
        //using set---
        Set<Integer> integerSet = new HashSet<>();
        integerList
                .stream()
                .filter(x->!integerSet.add(x))
                .forEach(System.out::println);

    }
}
