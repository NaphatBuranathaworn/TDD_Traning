package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomizerTest {

    private static final int DUMMY_RETURN=0;

    @Test
    public void verifyInteractionGetPatternBetweenRandomizeAndRandom() {
        Random OO7 = new RandomSpy();
        Randomizer randomizer = new Randomizer(OO7);
        int actual = randomizer.getPattern();
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasBeenCallOnceAndReceiveBoundTwo());
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasReturnCorrectValueWithPlusOne(actual));
    }

    @Test
    public void verifyInteractionGetOperandBetweenRandomizeAndRandom() {
        Random OO7 = new RandomSpy();
        Randomizer randomizer = new Randomizer(OO7);
        int actual = randomizer.getOperand();
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasBeenCallOnceAndReceiveBoundNine());
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasReturnCorrectValueWithPlusOne(actual));
    }

    @Test
    public void verifyInteractionGetOperatorBetweenRandomizeAndRandom() {
        Random OO7 = new RandomSpy();
        Randomizer randomizer = new Randomizer(OO7);
        int actual = randomizer.getOperator();
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasBeenCallOnceAndReceiveBoundFour());
        Assert.assertTrue(((RandomSpy) OO7).verifyTheNextIntHasReturnCorrectValueWithPlusOne(actual));
    }

    class RandomSpy extends Random {
        int token = 0;
        int bound = 0;

        @Override
        public int nextInt(int bound) {
            token++;
            this.bound = bound;
            return DUMMY_RETURN;
        }

        public boolean verifyTheNextIntHasBeenCallOnce() {
            return token==1;
        }

        public boolean verifyTheNextIntHasReceiveTwo() {
            return bound==2;
        }

        public boolean verifyTheNextIntHasBeenCallOnceAndReceiveBoundTwo() {
            return this.verifyTheNextIntHasBeenCallOnce() && this.verifyTheNextIntHasReceiveTwo();
        }

        public boolean verifyTheNextIntHasReceiveNine() {
            return bound==9;
        }

        public boolean verifyTheNextIntHasBeenCallOnceAndReceiveBoundNine() {
            return this.verifyTheNextIntHasBeenCallOnce() && this.verifyTheNextIntHasReceiveNine();
        }

        public boolean verifyTheNextIntHasReceiveFour() {
            return bound==4;
        }

        public boolean verifyTheNextIntHasBeenCallOnceAndReceiveBoundFour() {
            return this.verifyTheNextIntHasBeenCallOnce() && this.verifyTheNextIntHasReceiveFour();
        }

        public boolean verifyTheNextIntHasReturnCorrectValueWithPlusOne(int actualFromSpyRandom) {
            return actualFromSpyRandom==DUMMY_RETURN+1;
        }
    }

}
