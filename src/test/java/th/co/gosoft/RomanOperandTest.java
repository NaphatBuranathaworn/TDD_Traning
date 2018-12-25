package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

public class RomanOperandTest {

    @Test
    public void operandShouldReturnIWhenInput1() {
        RomanOperand romanOperand = new RomanOperand(1);
        String actual = romanOperand.getOperand();
        Assert.assertEquals("I", actual);
    }

    @Test
    public void operandShouldReturnVWhenInput5() {
        RomanOperand romanOperand = new RomanOperand(5);
        String actual = romanOperand.getOperand();
        Assert.assertEquals("V", actual);
    }

    @Test
    public void operandShouldReturnIXWhenInput9() {
        RomanOperand romanOperand = new RomanOperand(9);
        String actual = romanOperand.getOperand();
        Assert.assertEquals("IX", actual);
    }

}
