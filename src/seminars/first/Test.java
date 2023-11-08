package calculator;
import static org.assertj.core.api.Assertions.*;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculateDiscount(100, 5)).isEqualTo(95);
        assertThat(calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThat(calculator.calculateDiscount(100, 100)).isEqualTo(0);
        assertThatThrownBy(() -> calculator.calculateDiscount(0, 5)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculator.calculateDiscount(100, 101)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculator.calculateDiscount(100, -5)).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> calculator.calculateDiscount(-100, 5)).isInstanceOf(ArithmeticException.class);
    }
}
