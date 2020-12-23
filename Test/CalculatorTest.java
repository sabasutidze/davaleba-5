import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sumTest(){
        ServiceImpl calculatorService = new ServiceImpl();
        assertEquals(6, calculatorService.sum(2,4), 0);
    }

    @Test
    public void prodTest(){
        ServiceImpl calculatorService = new ServiceImpl();
        assertEquals(18, calculatorService.prod(3,6), 0);
    }

}