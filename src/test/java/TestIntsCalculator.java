
import org.example.Ints;
import org.example.IntsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntsCalculator {

    @Test
    public void testSum() {
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.sum(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testSub() {
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.sub(2, 2);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testMult() {
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.mult(4, 2);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testPow() {
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.pow(2, 10);
        Assertions.assertEquals(1024, result);
    }

    @Test
    public void testDiv() {
        Ints intsCalc = new IntsCalculator();
        int result = intsCalc.div(10, 2);
        Assertions.assertEquals(5, result);
    }

}
