package AlgoString;

public class day10_Numbers {

    public static void main(String[] args) {

        System.out.println(identifyOddEven(6));
        System.out.println(identifyOddEven(9));
        divides(90,6);
    }

    public static String identifyOddEven(int n) {
        return n%2 == 0 ? "even" : "odd";
    }

    public static void divides(int num1, int num2) {
        if (num2==0) {
            System.out.println("Invalid number");
        }
        System.out.print(num1 + " devid by " + num2 + " is: ");
        int count = 0;
        while (num1 > num2) {
            num1-=num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }

}
