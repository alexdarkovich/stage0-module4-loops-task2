package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }

    }
}
