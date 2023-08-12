import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountOfElements {
    public static void main(String[] args) {
        //Given a list of integers, find the total number of elements present in the list using Stream functions
        List<Integer> integerList = Arrays.asList(1,2,3,4);
        Long count = integerList
                .stream()
                .collect(Collectors.counting());
        System.out.println(count);

        Long count2 = integerList
                .stream().count();
        System.out.println(count2);

    }
}
