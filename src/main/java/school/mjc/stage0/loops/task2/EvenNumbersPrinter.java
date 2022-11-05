package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int toPrint = 2;
        while (toPrint <= printTillInclusive) {
            System.out.println(toPrint);
            toPrint += 2;
        }
    }
}
