package th.co.gosoft;

public class Operator {

    private final int operatorType;

    public Operator(int operatorType) {
        this.operatorType = operatorType;
    }

    public String toString() {
        String operatorMapping[] = new String[]{"+", "*", "-", "/"};
        if(operatorType > operatorMapping.length) {
            return null;
        }
        return operatorMapping[operatorType-1];
    }

}
