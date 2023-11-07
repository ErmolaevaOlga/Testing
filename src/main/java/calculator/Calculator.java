package calculator;

public class Calculator {
    public double calculateDiscount(int sum, int discount) throws ArithmeticException {
        if (sum <= 0) {
            throw new ArithmeticException("Sum must be more than 0");
        }
        if (discount < 0) {
            throw new ArithmeticException("Discount must be less than 0");
        }
        if (discount > 100) {
            throw new ArithmeticException("It very big discount!");
        }
        return sum - (sum * discount);
    }
}
