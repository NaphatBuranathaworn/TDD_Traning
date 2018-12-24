package th.co.gosoft;

public class StringOperand extends Operand {
    private final int input;

    public StringOperand(int input) {
        super(input);
        this.input = input;
    }

    public String toString() {
        String operand[] = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if(input > operand.length) return null;
        return operand[input-1];
    }
}
