import java.util.*;

public class AddArrays {
    public static void main(String[] args) {
        int[] a = {2,3,4,1} ;
        int[] b = {2,3,5,6,7,8,9};

        int max = Math.max(a.length, b.length);
        int[] result = new int[max];

        for(int i = 0; i < max; i++) {
            int x = (i < a.length) ? a[i] : 0;
            int y = (i < b.length) ? b[i] : 0;
            result[i] = x + y;
        }

        System.out.println("Result: " + Arrays.toString(result));
    }

}   

