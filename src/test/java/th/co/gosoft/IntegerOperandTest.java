package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

public class IntegerOperandTest {

    @Test
    public void itShouldBeStringOneWhenInput1() {
        IntegerOperand integerOperand = new IntegerOperand(1);
        Assert.assertEquals("1", integerOperand.toString());
    }

    @Test
    public void itShouldBeStringFiveWhenInput2() {
        IntegerOperand integerOperand = new IntegerOperand(5);
        Assert.assertEquals("5", integerOperand.toString());
    }

    @Test
    public void itSholdBeStringNineWhenInput9() {
        IntegerOperand integerOperand = new IntegerOperand(9);
        Assert.assertEquals("9", integerOperand.toString());
    }

}
