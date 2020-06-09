package racing;

import java.util.Random;

public class RandomGenerator {
    public int get() {
        Random random = new Random();
        return Math.abs(random.nextInt()) % 9;
    }
}
