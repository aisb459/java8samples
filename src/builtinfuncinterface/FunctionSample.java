package builtinfuncinterface;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        //apply()
        Function<Integer,Double> funcObj = a->a/2.0;
        Double output = funcObj.apply(10);
        System.out.println(output);

        //andThen()
        Function<Integer,Double> funcObj2 = a->a/2.0;
        funcObj2 = funcObj2.andThen(a->a*3);
        System.out.println(funcObj2.apply(10));

        //compose()
        Function<Integer,Double> funcObj3 = a->a/2.0;
        funcObj3 = funcObj3.compose(a->a*3);
        System.out.println(funcObj3.apply(5));

        //identity
        Function<Integer,Integer> funcObj4 = Function.identity();
        System.out.println(funcObj4.apply(10));
    }
}
