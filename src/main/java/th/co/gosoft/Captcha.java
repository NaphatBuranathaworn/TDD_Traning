package th.co.gosoft;

public class Captcha {
    private final int left;
    private  int _operator;
    private final int right;
    private final int pattern;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
         left = leftOperand;
        _operator = operator;
        right = rightOperand;
        this.pattern = pattern;
    }

    public Operand getLeftOperand() {
        if(pattern == 1) {
            return new StringOperand(left);
        }else {
            return new IntegerOperand(left);
        }
    }

    public Operator getOperator() {
        return new Operator(_operator);
    }

    public Operand getRightOperand() {
        if(pattern==2){
            return new StringOperand(right);
        } else {
            return new IntegerOperand(right);
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getLeftOperand()).append(" ");
        stringBuilder.append(getOperator()).append(" ");
        stringBuilder.append(getRightOperand());
        return  stringBuilder.toString();
    }
}
