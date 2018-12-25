package th.co.gosoft;

public class IntegerOperand extends Operand {

    private final int input;

    public IntegerOperand(int input) {
        super(input);
        this.input = operandValue;
    }

    public String toString() {
        return String.valueOf(input);
    }
}
