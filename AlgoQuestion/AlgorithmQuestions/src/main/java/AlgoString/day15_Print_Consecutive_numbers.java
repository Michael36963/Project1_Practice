package AlgoString;

public class day15_Print_Consecutive_numbers {

    public static void main(String[] args) {

        solution(30);

        Solution(30);
    }

    public static void solution(int N){
        String result = "";

        for(int i = 1; i < N; i++) {
            if(i%2==0 && i%3==0 && i%5==0)
                result += "CodilityTestCoders\n";
            else if(i%2==0 && i%3==0)
                result += "CodilityTest\n";
            else if (i%2==0 && i%5==0)
                result += "CodilityCoders\n";
            else if (i%3==0 && i%5==0)
                result += "TestCoders\n";
            else if (i%2==0)
                result += "Codility\n";
            else if (i%5==0)
                result += "Coders\n";
            else if (i%3==0)
                result += "Test\n";
            else
                result += i + "\n";
        }
        System.out.println(result);
    }

    public static int[] Solution(int N){

        int[] result = new int[N];

        int sum = 0;

        for (int i=0; i<N-1; i++) {
            result[i] = i;
            sum += i;
        }
        result[N-1] = -sum;

        return result;
    }
}
