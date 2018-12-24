package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

public class StringOperandTest {

    @Test
    public void itShouldReturnOneWhenInput1() {
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One", stringOperand.toString());
    }

    @Test
    public void itShouldReturnFiveWhenInput5() {
        StringOperand stringOperand = new StringOperand(5);
        Assert.assertEquals("Five", stringOperand.toString());
    }

    @Test
    public void itShouldReturnNineWhenInput9() {
        StringOperand stringOperand = new StringOperand(9);
        Assert.assertEquals("Nine", stringOperand.toString());
    }

}
