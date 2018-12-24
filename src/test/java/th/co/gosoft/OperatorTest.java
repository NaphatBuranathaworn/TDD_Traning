package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

public class OperatorTest {

    @Test
    public void itShouldReturnPlusWhenInputOne() {
        Operator operator = new Operator(1);
        String actual = operator.toString();
        Assert.assertEquals("+", actual);
    }

    @Test
    public void itShouldReturnMultiplyWhenInputTwo() {
        Operator operator = new Operator(2);
        String actual = operator.toString();
        Assert.assertEquals("*", actual);
    }

    @Test
    public void itShouldReturnMinusWhenInputThree() {
        Operator operator = new Operator(3);
        String actual = operator.toString();
        Assert.assertEquals("-", actual);
    }

    @Test
    public void itShouldReturnDivideWhenInputFour() {
        Operator operator = new Operator(4);
        String actual = operator.toString();
        Assert.assertEquals("/", actual);
    }

}
