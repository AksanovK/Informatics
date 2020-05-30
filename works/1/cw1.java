import java.util.Scanner;

public class cw1 {
    public static void main(String[] args) {
        Calculator symbol = new Calculator();
        Scanner scan = new Scanner(System.in);
        long result = 0;
        String stroka = scan.nextLine();
        try {
            Parse str = new Parse(stroka);
            String[] z = str.getFragments(str);
            long a = str.getA();
            long b = str.getB();
            if (z.equals("+")) {
                result = Calculator.addition(a,b);
            }
            if (z.equals("-")) {
                result = Calculator.subtraction(a,b);
            }
            if (z.equals("*")) {
                result = Calculator.multiplication(a,b)
            }
            if (z.equals("*")) {
                result = Calculator.division(a,b)
            }
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Возникла арифметическсая ошибка");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некорректные данные");
        }
    }
}
