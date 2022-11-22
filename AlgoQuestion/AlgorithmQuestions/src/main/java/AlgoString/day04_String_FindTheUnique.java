package AlgoString;

public class day04_String_FindTheUnique {

    public static void main(String[] args) {

        System.out.println(unique111("AAABBBCCCDEF"));

    }

    public static String unique111(String str) {
        String[] arr = str.split("");
        String unique1 = "";
        for (int j = 0; j < arr.length; j++) {
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j]))
                    num++;
            } if (num == 1)
                unique1 += arr[j];
        }return unique1;
    }

    public static String unique222(String str) {
        String[] arr = str.split("");
        StringBuilder unique1 = new StringBuilder();
        for (String s : arr) {
            int num = 0;
            for (String value : arr) {
                if (value.equals(s))
                    num++;
            }
            if (num == 1)
                unique1.append(s);
        }
        return unique1.toString();
    }

    public static String unique333(String str){
        String result = "";
        for (String each : str.split("")) {
//            result.append(((Collection.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "");
        }
        return result;
    }
}
