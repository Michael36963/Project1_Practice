package AlgoString;

import java.util.Arrays;

public class day06_Array_FindMaximum {

    public static void main(String[] args) {

        int[] array1 = {2,11,6,1,5,32,45,12};
        int[] array2 = {0,12,6,1,5,33,45,54};

        System.out.println(maxValue1(array1));
        System.out.println(maxValue2(array2));

    }

    public static  int maxValue1(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each: n)
            if (each > max)
                max = each;
        return max;
    }

    public static int maxValue2(int[] n){
        Arrays.sort(n);
        return n [n.length - 1];
    }
}
