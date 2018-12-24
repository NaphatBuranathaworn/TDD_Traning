package th.co.gosoft;

import java.util.HashMap;
import java.util.Map;

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

    public String getLeftOperand() {
        Map<Integer, String> leftOperandMapping = new HashMap<>();
        leftOperandMapping.put(1, "One");
        leftOperandMapping.put(2, "Two");
        leftOperandMapping.put(3, "Three");
        leftOperandMapping.put(4, "Four");
        leftOperandMapping.put(5, "Five");
        leftOperandMapping.put(6, "Six");
        leftOperandMapping.put(7, "Seven");
        leftOperandMapping.put(8, "Eight");
        leftOperandMapping.put(9, "Nine");

        if(pattern == 1) {
            return leftOperandMapping.get(this.left);
        }
        else {
            return String.valueOf(left);
        }

    }


    public Operator getOperator() {
        return new Operator(_operator);
    }

    public String getRightOperand() {
        Map<Integer, String> rightOperandMapping = new HashMap<>();
        rightOperandMapping.put(1, "One");
        rightOperandMapping.put(2, "Two");
        rightOperandMapping.put(3, "Three");
        rightOperandMapping.put(4, "Four");
        rightOperandMapping.put(5, "Five");
        rightOperandMapping.put(6, "Six");
        rightOperandMapping.put(7, "Seven");
        rightOperandMapping.put(8, "Eight");
        rightOperandMapping.put(9, "Nine");
        if(pattern==2){

            return rightOperandMapping.get(right);
        }
        else {
            return String.valueOf(right);
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
