package challenge4;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BirthdayParadox {

    public static void main(String[] args) {
        Random random = new Random();
        for (int n = 5; n <= 100; n += 5) {
            int numTrials = 10000;
            int numSuccesses = 0;
            for (int i = 0; i < numTrials; i++) {
                Set<Integer> birthdays = new HashSet<Integer>();
                boolean foundDuplicate = false;
                for (int j = 0; j < n; j++) {
                    int birthday = random.nextInt(365);
                    if (birthdays.contains(birthday)) {
                        foundDuplicate = true;
                        break;
                    }
                    birthdays.add(birthday);
                }
                if (foundDuplicate) {
                    numSuccesses++;
                }
            }
            double probability = (double) numSuccesses / numTrials;
            System.out.println("For n = " + n + ", probability of a shared birthday: " + probability);
        }
    }
}