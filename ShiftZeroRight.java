import java.util.*;

public class ShiftZeroRight {
    public static void main(String[] args) {
        int[] arr = {2,0,5,3,1,0,3,1};
        int[] result = new int[arr.length];

        int index = 0;

        for (int num : arr) {
            if (num != 0)
                result[index++] = num;
        }

        System.out.println(Arrays.toString(result));
    }
}