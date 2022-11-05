package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        while (num <= printToInclusive) {
            System.out.println(factorial(num));
            num++;
        }
    }
    public static int factorial(int n){
        if (n <= 1) {
            return 1;
        } else return  n * factorial(n - 1);
    }
}
