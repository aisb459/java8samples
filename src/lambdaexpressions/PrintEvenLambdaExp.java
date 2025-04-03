package lambdaexpressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PrintEvenLambdaExp {
    static void printEven(Collection<Integer> il, Predicate<Integer> p){
        for(Integer x: il){
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10,3,5,20));
        printEven(integerList,x->x%2==0);
    }
}
