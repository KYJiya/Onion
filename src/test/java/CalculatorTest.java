import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
//    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        System.out.println(cal.add(9, 3));
//        System.out.println(cal.subtract(9, 3));
//        System.out.println(cal.multiply(9, 3));
//        System.out.println(cal.divide(9, 3));
//    }

//    public static void main(String[] args) {
//        Calculator cal = new Calculator();
//        add(cal);
//        subtract(cal);
//        multiply(cal);
//        divide(cal);
//    }
//
//    private static void divide(Calculator cal) {
//        System.out.println(cal.divide(9, 3));
//    }
//
//    private static void multiply(Calculator cal) {
//        System.out.println(cal.multiply(9, 3));
//    }
//
//    private static void subtract(Calculator cal) {
//        System.out.println(cal.subtract(9, 3));
//    }
//
//    private static void add(Calculator cal) {
//        System.out.println(cal.add(9, 3));
//    }

    private Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() {
        assertEquals(9, cal.add(6, 3));
        System.out.println("add");
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6, 3));
        System.out.println("subtract");
    }

    @Test
    public void multiply() {
        assertEquals(18, cal.multiply(6, 3));
        System.out.println("multiply");
    }

    @Test
    public void divide() {
        assertEquals(2, cal.divide(6, 3));
        System.out.println("divide");
    }
    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }
}
