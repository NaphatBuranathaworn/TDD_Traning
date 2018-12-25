package th.co.gosoft;

import java.util.Random;

public class Randomizer {

    private final Random random;

    public Randomizer(Random random) {
        this.random = random;
    }

    public int getPattern() {
        return random.nextInt(2)+1;
    }

    public int getOperand() {
        return random.nextInt(9)+1;
    }

    public int getOperator() {
        return random.nextInt(4)+1;
    }
}
