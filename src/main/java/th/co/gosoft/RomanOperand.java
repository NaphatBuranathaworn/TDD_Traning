package th.co.gosoft;

public class RomanOperand {
    private final int input;

    public RomanOperand(int input) {
        this.input = input;
    }

    public String getOperand() {
        String romanOperand[] = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if(input > romanOperand.length) return null;
        return romanOperand[this.input-1];
    }
}
