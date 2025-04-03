package streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepCharacter {
    public static void main(String[] args) {
        String s = "Java documents are best";
        Character firstNonRepeating =
                s.chars()
                .mapToObj(e->Character.toLowerCase((char)e))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(x->x.getValue()==1L)
                        .map(x->x.getKey())
                        .findFirst().get();
        System.out.println("firstNonRepeating Chanracter is = "+firstNonRepeating);
    }

}
