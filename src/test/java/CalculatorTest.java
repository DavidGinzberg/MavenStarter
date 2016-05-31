import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void testAddition(){
        Calculator calc = new Calculator();

        int firstNum = 30;
        int secondNum = 12;
        int theAnswer = firstNum + secondNum;
        int actualResult = calc.add(firstNum, secondNum);

        Assert.assertEquals("Addition should add..", theAnswer, actualResult );
    }
}
