import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Objective:
Math calculator which can do following:
1. Addition of two numbers.
2. Subtraction of two numbers.
3. Multiplication of two numbers.
4. Division of two numbers.
*/
public class MathCalculatorTest {
    @Test
    void addingTwoNumbers() {
        /*
        Steps:
        1. Input number_1 and number_2.
        2. Perform addition.
        3. Output is addition of two numbers.
        */
        Assertions.assertEquals(5, MathCalculator.add(2, 3));
        Assertions.assertEquals(87, MathCalculator.add(38, 49));
        Assertions.assertEquals(50, MathCalculator.add(30, 20));
    }

    @Test
    void subtractingTwoNumbers() {
        /*
        Steps:
        1. Input number_1 and number_2.
        2. Perform subtraction.
        3. Output subtraction of two numbers.
        */
        int number1 = 10;
        int number2 = 5;
        int result = MathCalculator.subtraction(number1, number2);

        Assertions.assertEquals(5, result);
        Assertions.assertEquals(10, MathCalculator.subtraction(30, 20));
    }
}
