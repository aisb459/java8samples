package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharInStr {
    public static void main(String[] args) {
        // print the count of each character in a String
        String str = "java";
        Map<Character,Long> charCntMap = new LinkedHashMap<>();
        charCntMap= str.chars()
                .mapToObj(x->Character.toLowerCase((char)x))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                ;
        charCntMap.entrySet().forEach(x->System.out.println(x.getKey()+"  "+x.getValue()));

        System.out.println("**************************************");
        Map<String,Long> charCntMap2 = Arrays.stream(str.split(""))
                .map(x->x.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        charCntMap2.entrySet().forEach(x->System.out.println(x.getKey()+"  "+x.getValue()));



    }
}
