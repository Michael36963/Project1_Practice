package AlgoString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class day12_ArrayList_Remove {

    public static void main(String[] args) {

        List<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//        names.removeAll(Arrays.asList("Ahmed"));
        names1.removeAll(List.of("Ahmed"));
        System.out.println(names1);

        System.out.println("-------------------------------------");

        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Eric"));
//        for (ListIterator<String> it = names2.listIterator(); it.hasNext();)
//            if(it.next().equals("Ahmed"))
//                it.remove();
//        System.out.println(names2);
        names2.removeIf(s -> s.equals("Ahmed"));
        System.out.println(names2);

        System.out.println("-------------------------------------");

        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "John"));
            List<String> names4 = new ArrayList<>();
            names3.forEach(p -> {if (p.equals("Ahmed"))
                                    names4.add(p);} );
        System.out.println(names4);

        System.out.println("-------------------------------------");

        List<String> names5 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Ahmed", "Eric", "Ahmed"));
            Iterator<String> it = names5.iterator();
            while (it.hasNext()){
                if (it.next().equals("Ahmed"))
                    it.remove();
            }
        System.out.println(names5);
    }
}
