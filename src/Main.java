import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your operation + - * / ");
        char op = s.next().charAt(0);
        System.out.println("Enter first number: ");
        double variable1 = s.nextDouble();
        System.out.println("Enter second number: ");
        double variable2 = s.nextDouble();
       switch (op)
       {
           case '+':
           double sum = variable1 + variable2;
               System.out.println("result sum = " +sum);
               break;
           case '-':
               double sub = variable1 - variable2;
               System.out.println("result sub = " +sub);
               break;
           case '*':
               double mul = variable1 * variable2;
               System.out.println("result multi = " +mul);
               break;
           case '/':
               double div= variable1 / variable2;
               System.out.println("result divide = " +div);
               break;
           default:
               System.out.println("bye");
       }
    }
}