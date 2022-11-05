package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = 0;
        if (multiplyByAndToInclusive > 0) {
            while (n <= multiplyByAndToInclusive) {
                System.out.println(n * multiplyByAndToInclusive);
                n++;
            }
        }
        if (multiplyByAndToInclusive < 0) {
            int t = 0;
            while (n >= multiplyByAndToInclusive) {
                System.out.println(t * multiplyByAndToInclusive);
                n--;
                t++;
            }
        }
    }
}
