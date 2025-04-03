package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;

class Test5{
    int x,y;
    Test5(int x, int y){
        this.x=x;
        this.y=y;
    }
}
public class SortArray {
    public static void main(String[] args) {
        Test5[] testarray = {
                new Test5(10,2),
                new Test5(3,4),
                new Test5(5,6)
        };
        Arrays.sort(testarray, (obj1,obj2)->obj1.x-obj2.x);
        for(int i=0;i< testarray.length;i++){
            System.out.println(testarray[i].x+"  "+testarray[i].y);
        }
    }
}

