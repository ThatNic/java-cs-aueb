package gr.aueb.cs.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Εκτελείται πριν από κάθε test για να έχουμε "φρέσκο" αντικείμενο
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Έλεγχος πρόσθεσης: 2 + 3 = 5")
    void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Η πρόσθεση θα έπρεπε να επιστρέφει 5");
    }

    @Test
    @DisplayName("Έλεγχος διαίρεσης")
    void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    @DisplayName("Έλεγχος εξαίρεσης (Exception) στη διαίρεση με το μηδέν")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Θα έπρεπε να πετάει ArithmeticException");
    }

}