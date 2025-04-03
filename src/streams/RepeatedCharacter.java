package streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacter {
    public static void main(String[] args) {
        // Given a String, find the first repeated character in it using Stream functions
        String str = "java docs are the best";
        Character ch = str.chars()
                .mapToObj(x->Character.toLowerCase((char)x))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1L)
                .findFirst()
                .map(x->x.getKey())
                .get();
        System.out.println(ch);
    }
}
