package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PrintEvenNaiveApproach {
    static void printEven(Collection<Integer> integerList, Predicate<Integer> p){
        for(Integer x: integerList){
            if(p.test(x)){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        class PrintEvenNumber implements Predicate<Integer>{
            public boolean test(Integer i){
                return (i%2==0);
            }
        }
        List<Integer> integerList = new ArrayList<>(Arrays.asList(10,2,3,5,60));
        printEven(integerList,new PrintEvenNumber());


    }
}
