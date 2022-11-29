package AlgoString;

import java.util.Arrays;

public class day07_Array_FindMinimum {

    public static void main(String[] args) {

        int[] array1 = {2,11,6,1,5,32,45,12};
        int[] array2 = {0,12,6,1,5,33,45,54};

        System.out.println(maxValue1(array1));
        System.out.println(maxValue2(array2));


    }

    public static int maxValue1(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each: n)
            if (each < min)
                min = each;
        return min;
    }

    public static int maxValue2(int[] n){
        Arrays.sort(n);
        return n[0];
    }


}
