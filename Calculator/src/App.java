import java.util.Scanner;

import Models.Operations.ComCal;
import Models.Operations.ComplexNumbers;
import Models.Interfaces.iCalculator;
import Logger.FL;
import Logger.Log;

public class App {
    public static void main(String[] args) throws Exception {

        Log log = new FL("log.txt");
        iCalculator cal = new ComCal(log);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите действительную часть:");
        double material = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary1 = iScanner.nextDouble();
        ComplexNumbers n1 = new ComplexNumbers(material, imaginary1);

        System.out.print("Введите действие (+,*,/): ");
        char oper = iScanner.next().charAt(0);

        // Просим пользователя ввести второе комплексное число
        System.out.println("Введите действительную часть:");
        double material2 = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary2 = iScanner.nextDouble();
        ComplexNumbers n2 = new ComplexNumbers(material2, imaginary2);

        switch (oper) {
            case '+':
                ComplexNumbers sum = cal.add(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                ComplexNumbers prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                ComplexNumbers quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        iScanner.close();

    }

}
