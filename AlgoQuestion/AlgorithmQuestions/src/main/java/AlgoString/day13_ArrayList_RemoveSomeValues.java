package AlgoString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class day13_ArrayList_RemoveSomeValues {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,102,200,300,400,500,600));

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int each : list1)
            if (each<100)
                list2.add(each);
        list1=list2;
        System.out.println(list1);

        System.out.println("---------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,100,200,300,400,500,600));
        list3.removeIf(integer -> integer < 100);
        System.out.println(list3);

        System.out.println("---------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,100,200,300));
        Iterator<Integer> it = list4.iterator();
        while(it.hasNext())
            if (it.next() > 100)
                it.remove();
        System.out.println(list4);

        System.out.println("---------------------------------");



    }
}
