import java.util.Arrays;
import java.util.List;

public class MaxElementInList {
    public static void main(String[] args) {
        //Given a list of integers, find the maximum value element present in it using Stream functions
        List<Integer> integersList = Arrays.asList(1,2,3,34,5);
        int max = integersList
                .stream()
                .max(Integer::compare).get();
        int max1 = integersList
                .stream()
                .max((x,y)->Integer.compare(x,y)).get();
        System.out.println(max1);



    }
}
