import java.util.Arrays;
import java.util.List;

public class IntStartsWith1 {
    public static void main(String[] args) {
        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> integerList = Arrays.asList(11,12,14,15,29,18,12);
        integerList
                .stream()
                .map(x->x+"")
                .filter(x->x.startsWith("1"))
                .forEach(System.out::println);
    }
}
