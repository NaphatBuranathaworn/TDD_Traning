package th.co.gosoft;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CaptchaTest {

    public static final int DUMMY_OPERATOR = 3;
    public static final int DUMMY_RIGHT_OPERAND = 1;
    private static final int DUMMY_PATTERN = 1;
    private static final int DUMMY_LEFT_OPERAND = 2;

    @Test
    public void itShouldReturnOne() {
        Captcha captcha = new Captcha(1, 1, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        String actual = captcha.getLeftOperand();

        assertEquals("One", actual);
    }

    @Test
    public void  itShouldReturnNine(){
        Captcha captcha = new Captcha(1, 9, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        String actual = captcha.getLeftOperand();
        assertEquals("Nine", actual );
    }

    @Test
    public void itShouldReturnFive() {
        Captcha captcha = new Captcha(1, 5, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        String actual = captcha.getLeftOperand();
        assertEquals("Five", actual);
    }

//    @Test
//    public void itShouldReturnPlus() {
//        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT_OPERAND, 1, DUMMY_RIGHT_OPERAND);
//        String actual = captcha.getOperator();
//        assertEquals("+", actual);
//    }
//
//    @Test
//    public void itShouldReturnMultiply() {
//        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT_OPERAND,2,DUMMY_RIGHT_OPERAND);
//        String actual = captcha.getOperator();
//        assertEquals("*",actual);
//
//    }
//
//    @Test
//    public void itShouldReturnMinus(){
//        Captcha captcha = new Captcha(DUMMY_PATTERN, DUMMY_LEFT_OPERAND, 3, DUMMY_RIGHT_OPERAND);
//        String actual = captcha.getOperator();
//        assertEquals("-", actual);
//    }

    @Test
    public void itShouldReturnInstanceOfOperator() {
        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT_OPERAND,DUMMY_OPERATOR,1);
        Assert.assertTrue(captcha.getOperator() instanceof Operator);
    }

    @Test
    public void firstPatternRightOperandShouldBeStringOfNumber(){
        Captcha captcha = new Captcha(DUMMY_PATTERN,DUMMY_LEFT_OPERAND,DUMMY_OPERATOR,1);
        String actual = captcha.getRightOperand();
        assertEquals("1",actual);

    }

    @Test
    public void รูปแบบที่สองตัวแปรทางซ้ายควรจะเป็นตัวอักษรของตัวเลข(){
        Captcha captcha = new Captcha(2, 1, DUMMY_OPERATOR, DUMMY_RIGHT_OPERAND);
        String actual = captcha.getLeftOperand();
        assertEquals("1", actual);
    }

    @Test
    public void รูปแบบที่สองตัวแปรทางขวาเป็นตัวอักษรภาษาอังกฤษ(){
        Captcha  captcha =new Captcha(2,DUMMY_LEFT_OPERAND,DUMMY_OPERATOR,1);
        String actual = captcha.getRightOperand();
        assertEquals("One",actual);
    }

    @Test
    public void แสดงผลลัพธ์เป็นรูปแบบที่หนึ่ง_one_plus_1(){
        Captcha captcha = new Captcha(1,1,1,1);
        String actual = captcha.toString();
        assertEquals("One + 1",actual);
    }

    @Test
    public void แสดงผลลัพธ์เป็นรูปแบบที่สอง_1_plus_one(){
        Captcha captcha = new Captcha(2,1,1,1);
        String actual = captcha.toString();
        assertEquals("1 + One",actual);
    }
}
