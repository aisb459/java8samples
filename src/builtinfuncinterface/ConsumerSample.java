package builtinfuncinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        //print number
        Consumer<Integer> printObj = a-> System.out.println(a);
        printObj.accept(10);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        //multiply 2 to every integer in integer list
        Consumer<List<Integer>> modify = list->{
            for (int i=0;i< list.size();i++){
                list.set(i,2* list.get(i));
            }
        };
        Consumer<List<Integer>> display = list ->{
            list.stream().forEach(x-> System.out.println(x));
        };
//        modify.accept(integerList);
//        display.accept(integerList);

        display.andThen(modify).accept(integerList);
        display.accept(integerList);





    }
}
