package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int toPrint = 0;
        while (toPrint <= lastPrinted) {
            System.out.println(toPrint);
            toPrint++;
        }
    }
}
