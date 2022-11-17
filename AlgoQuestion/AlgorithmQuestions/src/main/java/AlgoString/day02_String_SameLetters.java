package AlgoString;

import java.util.Arrays;
import java.util.TreeSet;

public class day02_String_SameLetters {

    public static void main(String[] args) {

        System.out.println(same1("abc", "bca"));
        System.out.println(same1("abc", "bbc"));
        System.out.println("-----------------------");
        System.out.println(same2("abc", "bca"));
        System.out.println(same2("abc", "bbc"));
        System.out.println("-----------------------");
        System.out.println(same3("abc", "bca"));
        System.out.println(same3("abc", "bbc"));

    }

    public static boolean same1(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="",a2="";
        for (char each : ch1)
            a1 += each;
        for (char each : ch2)
            a2 += each;
        return a1.equals(a2);
    }

    public static boolean same2(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        StringBuilder a1= new StringBuilder();
        StringBuilder a2= new StringBuilder();
        for (char each : ch1)
            a1.append(each);
        for (char each : ch2)
            a2.append(each);
        return a1.toString().equals(a2.toString());
    }

    public static boolean same3(String str1, String str2){
        str1 = new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }
}
