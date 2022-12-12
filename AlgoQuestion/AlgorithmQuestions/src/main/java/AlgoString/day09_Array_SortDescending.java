package AlgoString;

import java.util.ArrayList;
import java.util.Arrays;

public class day09_Array_SortDescending {

    public static void main(String[] args) {

        int[] arr = {10,20,3,9,6,90,30};
        System.out.println(Arrays.toString(Sort2(arr)));
    }

    public static int[] Sort2(int[] a){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : a)
            list.add(each);
        for (int i = 0; i < a.length; i++) {
            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));
        } return a;
    }
    public static int findMax(ArrayList<Integer> a){
        int max = Integer.MIN_VALUE;
        for (int each : a)
            max= Math.max(max, each);
        return max;
    }
}
