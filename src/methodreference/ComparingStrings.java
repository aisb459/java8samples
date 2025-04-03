package methodreference;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparingStrings {
    public static void main(String[] args) {
        String[] sarr1 = {"geeks","for","abc"};
        String[] sarr2 = {"GeEKS","for","ABC"};
        if(Arrays.equals(sarr1,sarr2,String::compareToIgnoreCase)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
