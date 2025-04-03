package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppearsTwice {
    public static void main(String[] args) {
        // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
        List<Integer> integerList = Arrays.asList(1,2,1,3,2);
        Boolean result = true;
        Long cnt = integerList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1L)
                .map(x->x.getKey())
                .collect(Collectors.counting());
        System.out.println(cnt);
        if(cnt==0){
          result = false;
        }
        System.out.println(result);

    }
}
