package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PrintEvenAnonymousClass {
    static void printEven(Collection<Integer> il, Predicate<Integer> p){
        for(Integer x: il){
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return (integer%2==0);
            }
        };
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10,20,3,8,4,1));
        printEven(integerList,p);
    }
}
