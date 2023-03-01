package challenge3;
import java.util.Random;

public class TypoSentence {

    public static void main(String[] args) {
        String sentence = "I will never spam my friends again.";
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            String sentenceWithTypo = addTypo(sentence, random);
            System.out.println(i + ". " + sentenceWithTypo);
        }
    }

    public static String addTypo(String sentence, Random random) {
        StringBuilder sb = new StringBuilder(sentence);
        int typoIndex = random.nextInt(sentence.length());
        char typoChar = (char) (random.nextInt(25) + 97);
        sb.setCharAt(typoIndex, typoChar);
        return sb.toString();
    }
}   