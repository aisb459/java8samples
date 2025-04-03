package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
    public static void main(String[] args) {
        //How to find only duplicate elements with its count from the String ArrayList in Java8
        List<String> stringList = Arrays.asList("AA","BB","AA");
        Map<String,Long> cntMap = stringList
                .stream()
                .filter(x-> Collections.frequency(stringList,x)>1L)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        cntMap.entrySet().forEach(x->System.out.println(x));
    }
}
