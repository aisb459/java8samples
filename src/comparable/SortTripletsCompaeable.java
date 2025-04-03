package comparable;

import java.sql.Array;
import java.util.Arrays;

public class SortTripletsCompaeable implements Comparable<SortTripletsCompaeable>{
    int x,y,z;

    public SortTripletsCompaeable(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int compareTo(SortTripletsCompaeable s){
        return this.z-s.z;
    }
}

class SampleComparable{
    public static void main(String[] args) {
        SortTripletsCompaeable[] arr = new SortTripletsCompaeable[4];
        arr[0] = new SortTripletsCompaeable(1,2,8);
        arr[1] = new SortTripletsCompaeable(5,2,18);
        arr[2] = new SortTripletsCompaeable(1,2,1);
        arr[3] = new SortTripletsCompaeable(4,2,90);

        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i].x+"  "+arr[i].y+"  "+arr[i].z);
        }
    }
}
