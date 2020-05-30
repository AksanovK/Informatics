public class Calculator {
    private static long result;
    public static long addition(long a, long b) throws ArithmeticException {
        return result = a + b;
    }
    public static long subtraction(long a, long b) throws ArithmeticException {
        return result = a - b;
    }
    public static long multiplication(long a, long b) throws ArithmeticException {
        return result = a*b;
    }
    public static long division(long a, long b) throws ArithmeticException {
        return result = a/b;
    }
}
