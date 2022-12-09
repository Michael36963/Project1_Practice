package AlgoString;

import java.util.ArrayList;
import java.util.Arrays;

public class day08_Array_SortAscending {

    public static void main(String[] args) {

        int[] arr = {10,9,8,7,6,5};
        System.out.println(Arrays.toString(Sort1(arr)));


    }

    public static int[] Sort1(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : a)
            list.add(each);
        for (int i = 0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        } return a;
    }
    public static int findMin(ArrayList<Integer> a){
        int min = Integer.MAX_VALUE;
        for (int each : a)
            min= Math.min(min, each);
        return min;
    }
}
