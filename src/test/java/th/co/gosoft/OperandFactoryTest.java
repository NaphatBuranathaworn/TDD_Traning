package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

public class OperandFactoryTest {

    @Test
    public void firstPatternLeftOperandShouldReturnStringOperand() {
        OperandFactory operandFactory = new OperandFactory();
        Assert.assertTrue(operandFactory.createLeft(1,1) instanceof StringOperand);
    }

    @Test
    public void firstPatternRightOperandShouldReturnIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory();
        Assert.assertTrue(operandFactory.createRight(1,1) instanceof IntegerOperand);
    }

    @Test
    public void secondPatternLeftOperandShouldReturnIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory();
        Assert.assertTrue(operandFactory.createLeft(2,1) instanceof  IntegerOperand);
    }

    @Test
    public void secondPatternRightOperandShouldReturnStringOperand() {
        OperandFactory operandFactory = new OperandFactory();
        Assert.assertTrue(operandFactory.createRight(2,1) instanceof  StringOperand);
    }

}
