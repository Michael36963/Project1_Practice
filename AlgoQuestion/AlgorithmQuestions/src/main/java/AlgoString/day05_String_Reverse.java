package AlgoString;

public class day05_String_Reverse {

    public static void main(String[] args) {

        System.out.println(StringReverse1("ABCDEFG"));
        System.out.println(StringReverse2("ABCDEFG"));
        System.out.println(StringReverse3("ABCDEFG"));

    }

    public static String StringReverse1(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }

    public static String StringReverse2(String str){
        StringBuilder reverse= new StringBuilder();
        for (int i=str.length()-1; i>=0; i--){
            reverse.append(str.toCharArray()[i]);
        }
        return reverse.toString();
    }

    public static String StringReverse3(String str){
        return new StringBuffer(str).reverse().toString();
    }
}
