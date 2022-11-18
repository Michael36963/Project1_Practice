package AlgoString;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class day03_String_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDup1("AAABBBCCC"));
        System.out.println(removeDup2("AAABBBCCC"));
        System.out.println(removeDup3("AAABBBCCC"));
    }

    public static String removeDup1(String str){
        String result="";
        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += str.charAt(i);
        return result;
    }

    public static String removeDup2(String str){
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            if (!result.toString().contains("" + str.charAt(i)))
                result.append(str.charAt(i));
        return result.toString();
    }

    public static String removeDup3(String str){
        str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        System.out.println(str);
        str = str.replace(", ","").replace("[","").replace("]", "");
        return str;
    }
}
