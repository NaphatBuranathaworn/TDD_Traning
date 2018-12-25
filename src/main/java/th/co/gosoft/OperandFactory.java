package th.co.gosoft;

public class OperandFactory {

    public Operand createLeft(int pattern, int LeftOperand) {
        if(1 == pattern) {
            return new StringOperand(LeftOperand);
        }else {
            return new IntegerOperand(LeftOperand);
        }
    }

    public Operand createRight(int pattern, int rightOperand) {
        if(1 == pattern) {
            return new IntegerOperand(rightOperand);
        }else {
            return new StringOperand(rightOperand);
        }
    }
}
