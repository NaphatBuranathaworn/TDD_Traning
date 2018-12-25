package th.co.gosoft;

public class Captcha {

    private OperandFactory operandFactory;
    private Operand leftOperand;
    private Operand rightOperand;
    private Operator operator;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operandFactory = new OperandFactory();
        this.leftOperand = operandFactory.createLeft(pattern, leftOperand);
        this.rightOperand = operandFactory.createRight(pattern, rightOperand);
        this.operator = new Operator(operator);
    }

    public Operand getLeftOperand() {
        return leftOperand;
    }

    public Operator getOperator() {
        return operator;
    }

    public Operand getRightOperand() {
        return rightOperand;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLeftOperand());
        stringBuilder.append(" ");
        stringBuilder.append(getOperator());
        stringBuilder.append(" ");
        stringBuilder.append(getRightOperand());
        return  stringBuilder.toString();
    }
}
