package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 2;
        while (num <= printToInclusive) {
            checkPrimeNumber(num);
            num++;
        }
    }
    public void checkPrimeNumber(int n){
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println(n);
    }
}
