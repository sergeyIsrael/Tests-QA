//import org.junit.Assert;
//import org.junit.Test;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int add = calculator.add(3,4);
        Assertions.assertEquals(7, add);
    }
}
