package comparator;

import comparable.SortTripletsCompaeable;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class SortTripletsComparator {
    int x,y,z;

    public SortTripletsComparator(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}

class CompareLogic implements Comparator<SortTripletsComparator> {
    public int compare(SortTripletsComparator s1,SortTripletsComparator s2){
        return s1.z-s2.z;
    }
}

class SampleComparator{
    public static void main(String[] args) {
        SortTripletsComparator[] arr = new SortTripletsComparator[4];
        arr[0] = new SortTripletsComparator(1,2,8);
        arr[1] = new SortTripletsComparator(5,2,18);
        arr[2] = new SortTripletsComparator(1,2,1);
        arr[3] = new SortTripletsComparator(4,2,90);
        Arrays.sort(arr,new CompareLogic());
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].x+"  "+arr[i].y+"  "+arr[i].z);
        }
        


        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        Function<Double, Double> next = a -> (double) (3 * a);

        // Now triple the output of half function
        half = half.andThen(next);

        // Applying the function to get the result
        // and printing on console
        System.out.println(half.apply(10));
    }
}
