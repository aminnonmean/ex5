import pack.function1;

import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = 0;
        int expense = 0;
        while (true) {
            System.out.println("Выберите операцию и введите её номер:\n" +
                    "1. Добавить новый доход\n" +
                    "2. Добавить новый расход\n" +
                    "3. Выбрать систему налогообложения");
            String request = scanner.next();
            if (request.equals("1")) {
                System.out.println("Введите новый доход: ");
                income += Math.abs(Integer.parseInt(scanner.next()));
            } else if (request.equals("2")) {
                System.out.println("Введите новый расход: ");
                expense += Math.abs(Integer.parseInt(scanner.next()));
            } else if (request.equals("3")) {
                function1.calcTax(function1.tax6(income), function1.tax15(income, expense));
            } else if (request.equals("end")) {
                break;
            }
        }
    }
}
