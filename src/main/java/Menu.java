import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void MENU(){
        int choice = 100;
        Scanner scanner = new Scanner(System.in);
        do {
            try {


                System.out.println(
                        "        Меню:           " + "\n" +
                                " 0 - Вихід               " + "\n" +
                                " 1 - Похідні         " + "\n");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.println("Ви вибрали вихід");
                        System.exit(0);
                        break;
                    }
                    case 1: {
                        final double e=2.718;
                        double a= -2;
                        double b=3;
                        double x=2.4;

                       final Function expression =
                               new Division(new Multiplication( new Constant(a), new PowerFunction(x,new Constant(3))),
                                       new Multiplication(new Constant(2),new Constant(2)));
                        System.out.println("f("+x+") = " + expression.calculate(x));
                        System.out.println("f'("+x+") = " + expression.derivative().calculate(x));
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Невірне значення");
                scanner.nextLine();
            }
        } while (choice != 0);
    }
}
