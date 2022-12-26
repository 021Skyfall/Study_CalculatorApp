import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");
        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        String oper = scan.next();
        double num2 = scan.nextDouble();

        if (oper.equals("+")) {
            System.out.println(num1 + num2);
        } else if (oper.equals("-")) {
            System.out.println(num1 - num2);
        } else if (oper.equals("/")) {
            System.out.println(num1 / num2);
        } else if (oper.equals("*")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("해당 연산자는 입력되지 않습니다.");
        }
    }
}